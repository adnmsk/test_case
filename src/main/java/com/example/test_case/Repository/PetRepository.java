package com.example.test_case.Repository;

import com.example.test_case.Model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository <Pet, Long> {

}
