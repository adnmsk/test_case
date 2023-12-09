package com.example.testcase.service;

import com.example.testcase.model.Bird;
import com.example.testcase.model.Pet;
import com.example.testcase.repository.PetRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor



@Service
public class PetService extends AbstractObjectService<Pet> {

    private final PetRepository petRep;


    public Pet save(Pet pet){
        return petRep.save(pet);
    }

    @Override
    protected JpaRepository<Pet, Long> getRepository() {
        return petRep;
    }





}
