package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.stackroute")
@Configuration
public class BeanConfig {
    @Bean
    public Actor actor1()
    {
        return new Actor("Sandeep","male",21);
    }
    @Bean
    public Movie movie()
    {
        return new Movie(actor2());
    }
    @Bean
    public Actor actor2()
    {
        return new Actor("Sudeep","male",21);
    }
//    @Bean
//    public Movie movie1()
//    {
//        return new Movie(actor1());
//    }
}
