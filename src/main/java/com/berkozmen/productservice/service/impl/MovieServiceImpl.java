package com.berkozmen.productservice.service.impl;

import com.berkozmen.productservice.model.entity.Movie;
import com.berkozmen.productservice.repository.MovieRepository;
import com.berkozmen.productservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

}
