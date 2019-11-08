package com.microservice.rabbitmq.api.test;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author admin
 * @create 2018-03-06 14:15
 **/
public class MqTest {
    public static void main(String[] args) throws IOException {
        HttpHost host = new HttpHost("123.56.242.22", 15672);
        HttpGet httpGet = new HttpGet("/api/queues");
        //认证
        BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(new AuthScope("123.56.242.22",15672),new UsernamePasswordCredentials("admin","gong7682696"));
        CloseableHttpClient client = HttpClients.custom().setDefaultCredentialsProvider(credentialsProvider).build();

        HttpResponse response = client.execute(host, httpGet);

        HttpEntity entity = response.getEntity();
        String s = EntityUtils.toString(entity);
        System.out.println(s);
    }
}
