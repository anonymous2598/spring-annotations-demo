package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Movie {


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
}
