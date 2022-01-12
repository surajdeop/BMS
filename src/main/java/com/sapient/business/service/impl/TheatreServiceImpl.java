package com.sapient.business.service.impl;

import com.sapient.business.service.TheatreService;
import com.sapient.data.model.Theatre;
import com.sapient.data.repository.TheatreRepository;
import com.sapient.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService {
    @Autowired
    TheatreRepository theatreRepository;

    @Override
    public List<Theatre> getAll() {
        return theatreRepository.findAll();
    }

    @Override
    public Theatre save(Theatre entity) {
        return theatreRepository.saveAndFlush(entity);
    }

    @Override
    public Theatre update(Theatre entity) {
        //TODO: Need to add logic
        return null;
    }

    @Override
    public void delete(Theatre entity) {
        theatreRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer entityId) {
        theatreRepository.deleteById(entityId);
    }

    @Override
    public Theatre getById(Integer entityId) {
        return theatreRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
