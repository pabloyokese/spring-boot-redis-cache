package com.example.springcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcacheApplication.class, args);
    }

}