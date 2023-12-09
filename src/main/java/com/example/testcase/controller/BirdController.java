package com.example.testcase.controller;

import com.example.testcase.model.Bird;
import com.example.testcase.service.BirdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/birds")
public class BirdController {

    private final BirdService birdService;

    @PostMapping("/create")
    public ResponseEntity<Bird> create (@RequestBody Bird bird){
        Bird b=birdService.save(bird);
        return ResponseEntity.ok(bird);
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<Bird>> findAll (){
        return ResponseEntity.ok(birdService.findAll());

    }
    @GetMapping("/{id}")
    public ResponseEntity<Bird> findById (@PathVariable Long id){
        return ResponseEntity.ok(birdService.findById(id));

    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Bird> deleteById(@PathVariable Long id){
        birdService.delete(id);
        return null;
    }

    @PutMapping("/edit")
    public ResponseEntity<Bird> edit(@RequestBody Bird bird){
        return create(bird);
    }



}
