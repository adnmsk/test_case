package com.example.test_case.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Pet extends Animal {

    @Id
    @GeneratedValue
    @Column(name="id",nullable = false)
    private long id;

    @Column (name="color")
     private String color;


    private void walk(){
        System.out.println("The pet "+ super.getName()+" "+ super.getFamily() +"walks on the street");
    }

}
