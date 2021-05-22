package com.stackroute.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stackroute.domain"})
public class AppConfig {
    //@Bean definitions here
}
