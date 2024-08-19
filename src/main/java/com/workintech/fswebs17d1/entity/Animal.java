package com.workintech.fswebs17d1.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Animal {
    private  int id;
    private String name;
    public Animal(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public Animal(){

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
