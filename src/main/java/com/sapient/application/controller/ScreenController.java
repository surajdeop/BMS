package com.sapient.application.controller;

import com.sapient.application.api.ScreenApi;
import com.sapient.business.service.ScreenService;
import com.sapient.data.model.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreenController extends BaseController<Screen> implements ScreenApi {
    @Autowired
    ScreenService screenService;

    @Override
    protected List<Screen> getAllEntity() {
        return screenService.getAll();
    }

    @Override
    protected Screen saveEntity(Screen entity) {
        return screenService.save(entity);
    }

    @Override
    protected void updateEntity(Screen entity) {
        screenService.update(entity);
    }

    @Override
    protected void deleteEntity(Screen entity) {
        screenService.delete(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        screenService.deleteById(entityId);
    }

    @Override
    protected Screen getEntityById(Integer entityId) {
        return screenService.getById(entityId);
    }
}
