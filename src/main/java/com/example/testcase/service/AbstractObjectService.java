package com.example.testcase.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
abstract class AbstractObjectService <T>{
    protected abstract JpaRepository<T, Long> getRepository();

    public T save(T entity){return getRepository().save(entity);}

    public void delete (Long id){
        getRepository().deleteById(id);
    }

    public List<T> findAll(){
        return getRepository().findAll();
    }

    public T findById (Long id) { return getRepository().findById(id).orElseThrow(EntityNotFoundException::new);}

}
