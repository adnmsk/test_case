package com.example.test_case.Model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;





class BirdTest {

    @Test
    void getId() {
        Bird sparrow = new Bird(1L, "grey");
        System.out.println(sparrow);
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");
        System.out.println("the id is "+ sparrow.getId());
        sparrow.fly();
        assertThat(sparrow.getId()).isEqualTo(1L);


    }

    @Test
    void getColor() {
        Bird sparrow = new Bird(1L, "grey");
        System.out.println(sparrow);
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");
        System.out.println("the id is "+ sparrow.getId());
        sparrow.fly();
        assertThat(sparrow.getColor()).isEqualTo("grey");
    }



    @Test
    void setColor() {
        Bird sparrow = new Bird();
        sparrow.setId(2L);
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");
        System.out.println("the id is "+ sparrow.getId());
        sparrow.fly();
        assertDoesNotThrow(() -> sparrow.setColor("semi-grey"));
    }
}