package com.stackroute;

import com.stackroute.configuration.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main{
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        //for singleton beans
        System.out.println(context.getBean("movie")==context.getBean("movie"));

        //for prototype beans
        Movie movie= context.getBean("movieA",Movie.class);
        movie.displayActorDetails();
        Movie movie1 = context.getBean("movieB",Movie.class);
        movie1.displayActorDetails();
        System.out.println(movie==movie1);
    }
}
