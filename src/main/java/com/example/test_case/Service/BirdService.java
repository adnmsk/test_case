package com.example.test_case.Service;

import com.example.test_case.Model.Bird;
import com.example.test_case.Model.Pet;
import com.example.test_case.Repository.BirdRepository;
import com.example.test_case.Repository.PetRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor




    @Service
    public class BirdService {

        private BirdRepository birdRep;
        private Bird bird;

        public void save() {
            birdRep.save(bird);
        }


        public void scan() {

            Optional<Bird> birdOptional = birdRep.findById(1L);

        }


    }

