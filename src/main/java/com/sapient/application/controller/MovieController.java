package com.sapient.application.controller;

import com.sapient.application.api.MovieApi;
import com.sapient.business.service.MovieService;
import com.sapient.data.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController  extends BaseController<Movie> implements MovieApi {
    @Autowired
    MovieService movieService;


    @Override
    protected List<Movie> getAllEntity() {
        return movieService.getAll();
    }

    @Override
    protected Movie saveEntity(Movie entity) {
        return movieService.save(entity);
    }

    @Override
    protected void updateEntity(Movie entity) {
        movieService.update(entity);
    }

    @Override
    protected void deleteEntity(Movie entity) {
        movieService.delete(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        movieService.deleteById(entityId);
    }

    @Override
    protected Movie getEntityById(Integer entityId) {
        return movieService.getById(entityId);
    }
}
