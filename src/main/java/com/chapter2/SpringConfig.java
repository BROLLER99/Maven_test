package com.chapter2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class SpringConfig {
    @Bean
    public Coconut coconut(){
        return new Coconut();
    }
    @Bean
    public LimeImpl limeImpl(){
        return new LimeImpl();
    }
}
