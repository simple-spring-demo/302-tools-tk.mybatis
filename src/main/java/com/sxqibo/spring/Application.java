package com.sxqibo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.sxqibo")
@SpringBootApplication
public class Application {

    // 启动类
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
