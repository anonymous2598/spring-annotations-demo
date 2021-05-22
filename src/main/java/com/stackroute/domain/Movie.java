package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Movie implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    private Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }
//
//    @Autowired
//    public void setActor(Actor actor)
//    {
//        this.actor=actor;
//    }

    public void displayActorDetails()
    {
        System.out.println(this.actor.getName()+ " "+ this.actor.getGender()+ " "+ this.actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory: "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName: "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext: "+applicationContext);
    }
}
