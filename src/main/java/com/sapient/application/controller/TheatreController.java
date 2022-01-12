package com.sapient.application.controller;

import com.sapient.application.api.TheatreApi;
import com.sapient.business.service.TheatreService;
import com.sapient.data.model.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheatreController extends BaseController<Theatre> implements TheatreApi {
    @Autowired
    TheatreService theatreService;

    @Override
    protected List<Theatre> getAllEntity() {
        return theatreService.getAll();
    }

    @Override
    protected Theatre saveEntity(Theatre entity) {
        return theatreService.save(entity);
    }

    @Override
    protected void updateEntity(Theatre entity) {
        theatreService.update(entity);
    }

    @Override
    protected void deleteEntity(Theatre entity) {
        theatreService.delete(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        theatreService.deleteById(entityId);
    }

    @Override
    protected Theatre getEntityById(Integer entityId) {
        return theatreService.getById(entityId);
    }
}
