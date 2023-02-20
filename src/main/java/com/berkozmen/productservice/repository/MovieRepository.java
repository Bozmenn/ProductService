package com.berkozmen.productservice.repository;

import com.berkozmen.productservice.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
