package com.example.testcase.service;


import com.example.testcase.model.Bird;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BirdServiceTest {

    @Autowired
    BirdService birdService;

    @Test
    void saveTest() {

        Bird sparrow = new Bird();
        sparrow.setColor("black");
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");

        birdService.saveBird(sparrow);
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