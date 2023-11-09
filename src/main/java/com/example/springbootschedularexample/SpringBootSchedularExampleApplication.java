package com.example.springbootschedularexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedularExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedularExampleApplication.class, args);
    }

}
