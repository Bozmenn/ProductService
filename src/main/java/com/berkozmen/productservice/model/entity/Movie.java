package com.berkozmen.productservice.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "movie", schema = "movies") // @Table(name = "movies.movie")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer movieId;
    private String title;
    private Integer budget;
    private String homepage;
    private String overview;
    private Double popularity;
    @Column(name = "release_date")
    private Date releaseDate;
    private Long revenue;
    private Integer runtime;
    @Column(name = "movie_status")
    private String movieStatus;
    private String tagline;
    @Column(name = "vote_average")
    private Double voteAverage;
    @Column(name = "vote_count")
    private Integer voteCount;

}
