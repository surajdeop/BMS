package com.sapient.application.controller;

import com.sapient.application.api.ShowApi;
import com.sapient.business.service.ShowService;
import com.sapient.data.model.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShowController extends BaseController<Show> implements ShowApi {
    @Autowired
    ShowService showService;


    @Override
    protected List<Show> getAllEntity() {
        return showService.getAll();
    }

    @Override
    protected Show saveEntity(Show entity) {
        return showService.save(entity);
    }

    @Override
    protected void updateEntity(Show entity) {
        showService.update(entity);
    }

    @Override
    protected void deleteEntity(Show entity) {
        showService.delete(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        showService.deleteById(entityId);
    }

    @Override
    protected Show getEntityById(Integer entityId) {
        return showService.getById(entityId);
    }
}
