package com.example.springboot01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot01.mapper")
@SpringBootApplication
public class SpringBoot01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class, args);
    }

}
