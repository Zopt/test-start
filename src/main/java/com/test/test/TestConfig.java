package com.test.test;


import com.test.test.client.PrintUserClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("test.spring.start")
@ComponentScan
@Data
public class TestConfig {

    private String name;
    private int age;

    @Bean
    public  PrintUserClient testClient() {

        return new PrintUserClient(name, age);
    }
}
