package com.sapient.application.controller;

import com.sapient.application.api.BaseApi;
import com.sapient.data.model.Place;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

import java.util.List;

public abstract class BaseController<T> implements BaseApi<T> {
    @Override
    public ResponseEntity<List<T>> getAll() {
        return new ResponseEntity<>(getAllEntity(), HttpStatus.OK);
    }


    @Override
    public ResponseEntity<T> save(@NonNull T entity) {
        return new ResponseEntity<>(saveEntity(entity),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> update(@NonNull T entity) {
        updateEntity(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> delete(@NonNull T entity) {
        deleteEntity(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteById(@NonNull Integer entityId) {
        deleteEntityById(entityId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> getById(@NonNull Integer entityId) {
        return new ResponseEntity<>(getEntityById(entityId), HttpStatus.OK);
    }


    protected abstract List<T> getAllEntity();

    protected abstract T saveEntity(@NonNull T entity);

    protected abstract void updateEntity(@NonNull T entity);

    protected abstract void deleteEntity(@NonNull T entity);

    protected abstract void deleteEntityById(@NonNull Integer entityId);

    protected abstract T getEntityById(@NonNull Integer entityId);
}
