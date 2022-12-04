package com.Piroks.TestOnline;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicLong;

@Configuration
public class Config {
    @Bean
    public String getCounter(){return new String("test");}
}
