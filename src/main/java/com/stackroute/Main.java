package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main{
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        Movie movie= context.getBean(Movie.class);
//        movie.displayActorDetails();
        Movie movie1 =context.getBean(Movie.class);
        movie1.displayActorDetails();
        context.registerShutdownHook();

//        Movie movie1 = context.getBean("movie1",Movie.class);
//        movie1.displayActorDetails();
//        System.out.println(movie==movie1);
    }
}
