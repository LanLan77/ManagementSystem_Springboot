package com.lanlan77;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lanlan77.mapper")
public class ManangementSystemCurdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManangementSystemCurdApplication.class, args);
    }

}
