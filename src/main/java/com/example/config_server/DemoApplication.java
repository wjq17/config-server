package com.example.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
//添加注解，开启Spring Cloud Config的服务端功能
@EnableConfigServer
@SpringBootApplication
public class DemoApplication {

//  public static void main(String[] args) {
//    SpringApplication.run(DemoApplication.class, args);
//  }
  public static void main(String[] args){
    new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
  }
}

