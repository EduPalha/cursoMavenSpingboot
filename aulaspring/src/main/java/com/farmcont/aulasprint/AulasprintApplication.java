package com.farmcont.aulasprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.farmcont.domain.model")
@SpringBootApplication
public class AulasprintApplication {
    public static void main(String[] args) {

        SpringApplication.run(AulasprintApplication.class, args);
    }

}
