package com.sapient.business.service.impl;

import com.sapient.business.service.MovieService;
import com.sapient.data.model.Movie;
import com.sapient.data.repository.MovieRepository;
import com.sapient.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie entity) {
        return movieRepository.saveAndFlush(entity);
    }

    @Override
    public Movie update(Movie entity) {
        return null;
    }

    @Override
    public void delete(Movie entity) {
        movieRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer entityId) {
        movieRepository.deleteById(entityId);
    }

    @Override
    public Movie getById(Integer entityId) {
        return movieRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
