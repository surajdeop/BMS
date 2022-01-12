package com.sapient.application.controller;

import com.sapient.application.api.SeatApi;
import com.sapient.business.service.SeatService;
import com.sapient.data.model.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController extends BaseController<Seat> implements SeatApi {
    @Autowired
    SeatService seatService;


    @Override
    protected List<Seat> getAllEntity() {
        return seatService.getAll();
    }

    @Override
    protected Seat saveEntity(Seat entity) {
        return seatService.save(entity);
    }

    @Override
    protected void updateEntity(Seat entity) {
        seatService.update(entity);
    }

    @Override
    protected void deleteEntity(Seat entity) {
        seatService.delete(entity);
    }

    @Override
    protected void deleteEntityById(Integer entityId) {
        seatService.deleteById(entityId);
    }

    @Override
    protected Seat getEntityById(Integer entityId) {
        return seatService.getById(entityId);
    }
}
