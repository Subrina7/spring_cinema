package com.example.spring_cinema.repositories;

import com.example.spring_cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

// for implementing JPA repository
// gives access to methods from JPA
public interface MovieRepository extends JpaRepository<Movie, Long> {
}


