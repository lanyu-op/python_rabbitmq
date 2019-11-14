# python_rabbitmq
python客户端采集上传rabbitmq到入库示例

1、springboot 

2、mysql

3、rabbitmq

4、python 客户端

# 更新日志：

2019-11-8  跑通流程。

2019-11-14 rabbitmq 多消费者，消息顺序保障，并发提升。

# 计划日志：

# 使用说明：

1、centos 7 下安装rabbitmq 

docker search rabbitmq:management

docker pull rabbitmq:management

docker run -d -p 5672:5672 -p 15672:15672 --name rabbitmq rabbitmq:management

docker ps -a 查看容器

docker rm XXX删除容器

2、下载代码

3、编译运行


# 架构说明：

![](https://github.com/lanyu-op/python_rabbitmq/blob/master/%E6%9E%B6%E6%9E%84%E8%AF%B4%E6%98%8E.png)  
