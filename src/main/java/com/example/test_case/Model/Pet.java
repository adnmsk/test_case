package com.example.test_case.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name="dogs")
public class Pet extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long id;

    @Column (name="color")
     private String color;


    public void walk(){
        System.out.println("The pet "+ super.getName()+" "+ super.getFamily() +"walks on the street");
    }

}
