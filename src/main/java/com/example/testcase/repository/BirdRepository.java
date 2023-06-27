package com.example.testcase.repository;

import com.example.testcase.model.Bird;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends CrudRepository <Bird, Long>{

}
