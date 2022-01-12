package com.sapient.business.service.impl;

import com.sapient.business.service.ShowService;
import com.sapient.data.model.Show;
import com.sapient.data.repository.ShowRepository;
import com.sapient.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowRepository showRepository;

    @Override
    public List<Show> getAll() {
        return showRepository.findAll();
    }

    @Override
    public Show save(Show entity) {
        return showRepository.saveAndFlush(entity);
    }

    @Override
    public Show update(Show entity) {
        return null;
    }

    @Override
    public void delete(Show entity) {
        showRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer entityId) {
        showRepository.deleteById(entityId);
    }

    @Override
    public Show getById(Integer entityId) {
        return showRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
