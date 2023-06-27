package com.example.testcase.repository;

import com.example.testcase.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository <Pet, Long> {

}
