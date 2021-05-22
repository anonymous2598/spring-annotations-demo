package com.stackroute;

import com.stackroute.configuration.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
        System.out.println("Using Application Context: ");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie= context.getBean("movie1",Movie.class);
        movie.displayActorDetails();
        System.out.println("Using XmlBeanFactory: ");
        BeanFactory factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = factory.getBean(Movie.class);
        movie1.displayActorDetails();
        System.out.println("Using BeanDefintionRegistry: ");
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) factory;
        if(beanDefinitionRegistry.containsBeanDefinition("movie1"))
        {
            BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//            beanDefinitionReader.loadBeanDefinitions("beans.xml");
            //to modify
            Movie movie2 = factory.getBean("movie1",Movie.class);
            movie2.displayActorDetails();
        }

    }

}
