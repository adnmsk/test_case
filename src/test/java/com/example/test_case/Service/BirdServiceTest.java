package com.example.test_case.Service;

import com.example.test_case.Model.Bird;
import com.example.test_case.Repository.BirdRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BirdServiceTest {

    @Test
    void saveTest() {

        Bird sparrow = new Bird();
        sparrow.setColor("black");
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");

        BirdService b1 = new BirdService();
        //b1.saveBird(sparrow);









    }

    @Test
    void scan() {

    }

    @Test
    void getBirdRep() {
    }

    @Test
    void getBird() {
    }

    @Test
    void setBirdRep() {
    }

    @Test
    void setBird() {
    }
}