package com.sapient.application.api;

import com.sapient.data.model.Theatre;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/theatre")
@Api(tags = "theatre-api")
public interface TheatreApi extends BaseApi<Theatre> {
//    @PutMapping(value = "/add",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    ResponseEntity<String> addTheatreToPlace(@NonNull @RequestBody Theatre entity);
}
