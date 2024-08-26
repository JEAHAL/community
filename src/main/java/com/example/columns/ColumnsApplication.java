package com.example.columns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColumnsApplication {

    public static void main(String[] args) {

        SpringApplication.run(ColumnsApplication.class, args); //自动创建spring容器 & 调用Tomcat
    }

}
