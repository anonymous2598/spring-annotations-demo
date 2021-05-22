package com.stackroute.domain;


public class Movie {

    private Actor actor;


    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void displayActorDetails()
    {
        System.out.println(this.actor.getName()+ " "+ this.actor.getGender()+ " "+ this.actor.getAge());
    }
}
