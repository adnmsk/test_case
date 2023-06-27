package com.example.test_case.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Bird extends Animal {

    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private long id;

    @Column (name="color")
    private String color;


    public void fly(){
        System.out.println("The bird "+ super.getName()+" "+ super.getFamily()+" flies in the sky");
    }

}

