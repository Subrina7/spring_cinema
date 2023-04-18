package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    public Optional<Movie> getMovieById(Long id){
        return movieRepository.findById(id);
    }

    public void addMovies(String title, int rating, int duration){
        Movie movie = new Movie(title, rating, duration);
        movieRepository.save(movie);
    }

    public void removeMovies(String title, int rating, int duration){
        Movie movie = new Movie(title, rating, duration);
        movieRepository.delete(movie);
        movieRepository.save(movie);
    }
    public void updateMovie(Movie movie){
        movie.setDuration(100);
        // movie.setTitle(this.title);
        movieRepository.save(movie);
    }


}

