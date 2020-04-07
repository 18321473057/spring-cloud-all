package com.line.cloud.springeurekaline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaLineApplication.class, args);
    }

}
