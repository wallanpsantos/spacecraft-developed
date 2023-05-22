package com.br.spacecraftdeveloped;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpacecraftDevelopedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpacecraftDevelopedApplication.class, args);
    }

}
