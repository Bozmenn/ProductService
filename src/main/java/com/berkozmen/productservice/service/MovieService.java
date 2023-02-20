package com.berkozmen.productservice.service;

import com.berkozmen.productservice.model.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();
    Movie findById();

}
