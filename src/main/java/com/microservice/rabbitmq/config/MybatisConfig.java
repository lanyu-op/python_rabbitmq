package com.microservice.rabbitmq.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * Mybatis配置
 * @author netcloud
 * @date Oct 29, 2019
 */
@Configuration
@MapperScan({"com.microservice.rabbitmq.*.mapper","com.microservice.rabbitmq.*.mapperx"})	// 扫描DAO
public class MybatisConfig {
  @Autowired
  private DataSource dataSource;

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setTypeAliasesPackage("com.microservice.rabbitmq.*.entity");	// 扫描Model
    
	//PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();("classpath*:**/mapping/*.xml")
	//sessionFactory.setMapperLocations(resolveMapperLocations("/mapping/**/*.xml", "/mappingx/**/*.xml"));	// 扫描映射文件
	//classpath*:com/microservice/rabbitmq/**/xml/*Mapper.xml
    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/microservice/rabbitmq/**/xml/*Mapper.xml"));

    return sessionFactory.getObject();
  }
  
  private org.springframework.core.io.Resource[] resolveMapperLocations(String... mapperLocations) {
      ResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
      List<org.springframework.core.io.Resource> resources = new ArrayList<>();
      for (String mapperLocation : mapperLocations) {
          try {
              org.springframework.core.io.Resource[] mappers = resourceResolver.getResources(mapperLocation);
              resources.addAll(Arrays.asList(mappers));
          } catch (IOException e) {
              // ignore
          }
      }
      return resources.toArray(new org.springframework.core.io.Resource[resources.size()]);
  }

}