package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor actor;

    public Movie() {
        
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void displayActorDetails()
    {
        System.out.println(this.actor.getName()+ " "+ this.actor.getGender()+ " "+ this.actor.getAge());
    }
}
