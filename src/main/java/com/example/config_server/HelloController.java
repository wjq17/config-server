package com.example.config_server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: config_server
 * @description: hello
 * @author: junQiuW
 * @create: 2018-07-23 21:53
 **/

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello,this is a springboot demo";
  }
}

