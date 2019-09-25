package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
    private String gender;
    private int age;

    public Actor(){

    }
    public Actor(String name,String gender, int age)
    {
        this.age=age;
        this.gender=gender;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
