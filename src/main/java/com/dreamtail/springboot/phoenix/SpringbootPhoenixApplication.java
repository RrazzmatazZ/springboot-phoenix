package com.dreamtail.springboot.phoenix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xdq
 */
@SpringBootApplication
@MapperScan("com.dreamtail.springboot.phoenix.dao")
public class SpringbootPhoenixApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootPhoenixApplication.class, args);
  }

}
