package com.example.testcase.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
class PetTest {
    @Test
    void getId() {
        Pet dog = new Pet(1L, "grey");
        System.out.println(dog);
        dog.setFamily("lobos");
        dog.setName("Sheep-dog");
        System.out.println("the id is " + dog.getId());
        dog.walk();
        assertThat(dog.getId()).isEqualTo(1L);
    }

    @Test
    void getColor() {
        Pet dog = new Pet(1L, "grey");
        System.out.println(dog);
        dog.setFamily("lobos");
        dog.setName("Sheep-dog");
        System.out.println("the id is " + dog.getId());
        dog.walk();

        assertThat(dog.getColor()).isEqualTo("grey");
    }
    @Test
    void setColor() {
        Pet dog = new Pet();
        System.out.println(dog);
        dog.setId(3L);
        dog.setFamily("lobos");
        dog.setName("Sheep-dog");
        System.out.println("the id is " + dog.getId());
        dog.walk();
        assertThat(dog.getId()).isEqualTo(3L);
        assertDoesNotThrow(() -> dog.setColor("semi-grey"));
    }
}