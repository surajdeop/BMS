package com.sapient.application.controller;

import com.sapient.application.api.PlaceApi;
import com.sapient.business.service.PlaceService;
import com.sapient.data.model.Place;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaceController extends BaseController<Place> implements PlaceApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceController.class);
    @Autowired
    PlaceService placeService;

    @Override
    protected List<Place> getAllEntity() {
        return placeService.getAll();
    }

    @Override
    protected Place saveEntity(Place entity) {
        LOGGER.info("Saving entity");
        return placeService.save(entity);
    }

    @Override
    protected void updateEntity(Place entity) {
        placeService.update(entity);
    }

    @Override
    protected void deleteEntity(Place entity) {
        placeService.update(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        placeService.deleteById(entityId);
    }

    @Override
    protected Place getEntityById(Integer entityId) {
        return placeService.getById(entityId);
    }
}
