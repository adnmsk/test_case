package com.example.testcase.service;


import com.example.testcase.model.Bird;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class BirdServiceTest {

    @Autowired
    BirdService birdService;

    @Test
    @Commit
    void saveTest() {

        Bird sparrow = new Bird();
        sparrow.setColor("black");
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");


    }

    @Test
    @Commit



    void scan() {
        Bird sparrow = new Bird();
        sparrow.setColor("black");
        sparrow.setFamily("ravens");
        sparrow.setName("Sparrow");
        sparrow.setNumber(1);
        birdService.saveBird(sparrow);

        Bird crow = new Bird();
        crow.setColor("black");
        crow.setFamily("ravens");
        crow.setName("Crow");
        crow.setNumber(3);
        birdService.saveBird(crow);


    Iterable<Bird> b1=birdService.allBirdsList();
        for (Bird bird:b1
             ) {
            System.out.println(bird.getName()+" "+bird.getFamily()+" "+bird.getColor()+" "+bird.getId()+" "+bird.getNumber());
        };
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