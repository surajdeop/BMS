package com.sapient.application.api;

import com.sapient.data.model.Place;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/place")
@Api(tags = "place-api")
public interface PlaceApi extends BaseApi<Place> {
}
