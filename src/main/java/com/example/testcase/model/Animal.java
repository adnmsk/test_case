package com.example.testcase.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@MappedSuperclass
public abstract class Animal {
    @Id
    @SequenceGenerator(name = "1",allocationSize = 100, initialValue = 200)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int number;
    private String family;
    private String name;
}
