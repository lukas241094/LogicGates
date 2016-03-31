package org.gradle;


import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
    }
}