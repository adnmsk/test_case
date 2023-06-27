package com.example.testcase.service;

import com.example.testcase.model.Bird;
import com.example.testcase.repository.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BirdService {
    private final BirdRepository birdRepository;

    public BirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    public Bird getBirdById(Long id) {
        Optional<Bird> bird = birdRepository.findById(id);
        return new Bird();
    }

    public List<Bird> allBirdsList() {
        Iterable<Bird> iterable = birdRepository.findAll();
        ArrayList<Bird> birds = new ArrayList<>();
        for (Bird bird : iterable) {
            birds.add(new Bird());

        }
        return birds;
    }

    public void saveBird(Bird bird) {
        birdRepository.save(bird);
    }

}




