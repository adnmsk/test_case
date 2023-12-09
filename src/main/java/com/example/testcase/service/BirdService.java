package com.example.testcase.service;

import com.example.testcase.model.Bird;
import com.example.testcase.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BirdService extends AbstractObjectService<Bird> {
    private final BirdRepository birdRepository;

    public BirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }



    public Bird save(Bird bird) {
        return birdRepository.save(bird);
    }

    @Override
    protected JpaRepository <Bird, Long> getRepository() {
        return birdRepository;
    }
}




