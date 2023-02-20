package com.berkozmen.productservice.controller;

import com.berkozmen.productservice.model.entity.Movie;
import com.berkozmen.productservice.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productService/api/")
public class MovieController {
    @Autowired
    private MovieServiceImpl movieServiceImpl;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieServiceImpl.findAll());
    }

}
