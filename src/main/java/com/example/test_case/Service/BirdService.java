package com.example.test_case.Service;

import com.example.test_case.Model.Bird;
import com.example.test_case.Repository.BirdRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Getter
@Setter
@ToString
@RequiredArgsConstructor




    @Service
    public class BirdService {

    private BirdRepository birdRepository;
    public BirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }




    public Bird getBirdbyId(Long id){
        Optional<Bird> bird = birdRepository.findById(id);
        return new Bird ();
    }

    public List<Bird> allBirdsList (){
        Iterable <Bird> iterable = birdRepository.findAll();
        ArrayList<Bird> birds = new ArrayList<>();
        for (Bird bird: iterable){
            birds.add(new Bird ());

        }
        return birds;
    }

    public void saveBird(Bird bird){

        birdRepository.save(bird);



    }

}




