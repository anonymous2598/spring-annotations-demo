package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main{
    public static void main(String[] args) {
        System.out.println("Using Application Context: ");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= context.getBean("MovieA",Movie.class);
        movie.displayActorDetails();
        Movie movie1 = context.getBean("MovieB",Movie.class);
        System.out.println(movie==movie1);
//        System.out.println("Using XmlBeanFactory: ");
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie1 = factory.getBean("movie",Movie.class);
//        movie1.displayActorDetails();
//        System.out.println("Using BeanDefintionRegistry: ");
//        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) factory;
//        if(beanDefinitionRegistry.containsBeanDefinition("movie"))
//        {
//            BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//            beanDefinitionReader.loadBeanDefinitions("beans.xml");
//            //to modify
//            Movie movie2 = factory.getBean("movie",Movie.class);
//            movie2.displayActorDetails();
//        }

    }

}
