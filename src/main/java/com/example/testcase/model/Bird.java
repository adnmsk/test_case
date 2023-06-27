package com.example.testcase.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Bird extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String color;

    public void fly(){
        System.out.println("The bird "+ super.getName()+" "+ super.getFamily()+" flies in the sky");
    }

}

