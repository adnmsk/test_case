package com.example.testcase.controller;

import com.example.testcase.model.Pet;
import com.example.testcase.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/pets")
public class PetController {


        private final PetService petService;

        @PostMapping("/create")
        public ResponseEntity<Pet> create (@RequestBody Pet pet){
            Pet p=petService.save(pet);
            return ResponseEntity.ok(p);
        }

        @GetMapping("/find-all")
        public ResponseEntity<List<Pet>> findAll (){
            return ResponseEntity.ok(petService.getPetRep().findAll());

        }
        @GetMapping("/{id}")
        public ResponseEntity<Pet> findById (@PathVariable Long id){
            return ResponseEntity.ok(petService.findById(id));

        }

        @DeleteMapping ("/{id}")
        public ResponseEntity<Pet> deleteById(@PathVariable Long id){
            petService.delete(id);
            return null;
        }

        @PutMapping("/edit")
        public ResponseEntity<Pet> edit(@RequestBody Pet pet){
            return create(pet);
        }



    }
