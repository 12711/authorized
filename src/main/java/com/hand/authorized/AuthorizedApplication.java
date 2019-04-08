package com.hand.authorized;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.hand.authorized"})
public class AuthorizedApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizedApplication.class, args);
    }

}
