package com.sapient.business.service.impl;

import com.sapient.business.service.ScreenService;
import com.sapient.data.model.Screen;
import com.sapient.data.repository.ScreenRepository;
import com.sapient.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreenServiceImpl implements ScreenService {
    @Autowired
    ScreenRepository screenRepository;

    @Override
    public List<Screen> getAll() {
        return screenRepository.findAll();
    }

    @Override
    public Screen save(Screen entity) {
        return screenRepository.saveAndFlush(entity);
    }

    @Override
    public Screen update(Screen entity) {
        return null;
    }

    @Override
    public void delete(Screen entity) {
        screenRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer entityId) {
        screenRepository.deleteById(entityId);
    }

    @Override
    public Screen getById(Integer entityId) {
        return screenRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
