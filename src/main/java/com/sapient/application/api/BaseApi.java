package com.sapient.application.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface BaseApi<T> {
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<T>> getAll();

    @PostMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<T> save(@NonNull @RequestBody T entity);

    @PutMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> update(@NonNull @RequestBody T entity);

    @DeleteMapping(value = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> delete(@NonNull @RequestBody T entity);

    @DeleteMapping(value = "/{entityId}")
    ResponseEntity<String> deleteById(@NonNull @PathVariable Integer entityId);

    @GetMapping(value = "/{entityId}")
    ResponseEntity<T> getById(@NonNull Integer entityId);
}
