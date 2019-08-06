# springboot-kafka-producer
springboot整合kafka集群当消息队列，zookeeper集群当注册中心

jdk:1.8, springboot:2.1.6, spring-kafka:2.2.7, 

kafka集群其中一个端口是192.168.137.130:9093
```
│  
├─.mvn
│  └─wrapper
│          maven-wrapper.jar
│          maven-wrapper.properties
│          MavenWrapperDownloader.java
│          
│      
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─ssm
│  │  │          │  SpringBootKafkaProducerApplication.java  //启动类
│  │  │          │  
│  │  │          ├─controller
│  │  │          │      UserController.java			//controller类
│  │  │          │      
│  │  │          ├─pojo					//bean
│  │  │          │      User.java
│  │  │          │      
│  │  │          └─service
│  │  │              │  KafkaService.java			//kafka接口
│  │  │              │  
│  │  │              └─impl
│  │  │                      KafkaServiceImpl.java		//kafka实现类
│  │  │                      
│  │  └─resources
│  │      │  application.yml					//kafka全局配置文件
│  │      │  
│  │      ├─static
│  │      └─templates
```
