package ru.badian.findproperty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class FindPropertyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindPropertyApplication.class, args);
    }

}
