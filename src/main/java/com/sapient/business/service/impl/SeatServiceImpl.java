package com.sapient.business.service.impl;

import com.sapient.business.service.SeatService;
import com.sapient.data.model.Seat;
import com.sapient.data.repository.SeatRepository;
import com.sapient.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatRepository seatRepository;

    @Override
    public List<Seat> getAll() {
        return seatRepository.findAll();
    }

    @Override
    public Seat save(Seat entity) {
        return seatRepository.saveAndFlush(entity);
    }

    @Override
    public Seat update(Seat entity) {
        return null;
    }

    @Override
    public void delete(Seat entity) {
        seatRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer entityId) {
        seatRepository.deleteById(entityId);
    }

    @Override
    public Seat getById(Integer entityId) {
        return seatRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
