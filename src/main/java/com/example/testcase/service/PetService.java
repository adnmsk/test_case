package com.example.testcase.service;

import com.example.testcase.model.Pet;
import com.example.testcase.repository.PetRepository;
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
public class PetService {

    private PetRepository   petRep;
    private Pet pet;

    public void save(){
        petRep.save(pet);
    }


    public void scan(){

            Optional<Pet> petOptional = petRep.findById(1l);

    }


}
