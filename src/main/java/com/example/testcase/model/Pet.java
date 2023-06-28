package com.example.testcase.model;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor


@Entity
public class Pet extends Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getColor() {
        return color;
    }

    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public long getId() {
        return id;
    }



    public void walk() {
        System.out.println("The pet " + super.getName() + " " + super.getFamily() + "walks on the street");
    }

}
