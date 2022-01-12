package com.sapient.business.service;

import com.sapient.data.model.BaseModel;
import org.springframework.lang.NonNull;

import java.util.List;

public interface BaseService<T extends BaseModel> {
    List<T> getAll();

    T save(@NonNull T entity);

    T update(@NonNull T entity);

    void delete(@NonNull T entity);

    void deleteById(@NonNull Integer entityId);

    T getById(@NonNull Integer entityId);

}