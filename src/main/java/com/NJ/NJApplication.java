package com.NJ;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启缓存注解
@Slf4j
public class NJApplication {
    public static void main(String[] args) {
        SpringApplication.run(NJApplication.class, args);
        log.info("server started");
    }
}

