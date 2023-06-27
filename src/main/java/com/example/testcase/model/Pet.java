package com.example.testcase.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Pet extends Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String color;

    public void walk() {
        System.out.println("The pet " + super.getName() + " " + super.getFamily() + "walks on the street");
    }

}
