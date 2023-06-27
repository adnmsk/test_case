package com.example.test_case.Model;

import io.lettuce.core.dynamic.annotation.CommandNaming;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="birds")
public class Bird extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long id;

    @Column (name="color")
    private String color;


    public void fly(){
        System.out.println("The bird "+ super.getName()+" "+ super.getFamily()+" flies in the sky");
    }

}

