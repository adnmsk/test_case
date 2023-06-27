package com.example.test_case.Model;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {


   private int number;
    @Column (name="family")
   private String family;

    @Column(name="name")
   private String name;


}
