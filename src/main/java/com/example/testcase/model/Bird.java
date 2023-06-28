package com.example.testcase.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor


@ToString

@Entity
public class Bird extends Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String color;

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
    public long getId() {
        return id;
    }
    public void fly(){
        System.out.println("The bird "+ super.getName()+" "+ super.getFamily()+" flies in the sky");
    }

}

