package com.sapient.business.service.impl;

import com.sapient.business.service.PlaceService;
import com.sapient.data.model.Place;
import com.sapient.data.repository.PlaceRepository;
import com.sapient.exception.NoDataFoundException;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public List<Place> getAll() {
        return placeRepository.findAll();
    }

    @Override
    public Place save(@NonNull Place entity) {
        return placeRepository.save(entity);
    }

    @Override
    public Place update(@NonNull Place entity) {
        //TODO: Need to implement
        return null;
    }

    @Override
    public void delete(@NonNull Place entity) {
        placeRepository.delete(entity);
    }

    @Override
    public void deleteById(@NonNull Integer entityId) {
        placeRepository.deleteById(entityId);
    }

    @Override
    public Place getById(@NonNull Integer entityId) {
        return placeRepository.findById(entityId).orElseThrow(NoDataFoundException::new);
    }
}
