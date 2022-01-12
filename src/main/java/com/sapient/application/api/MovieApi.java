package com.sapient.application.api;

import com.sapient.data.model.Movie;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/movie")
@Api(tags = "movie-api")
public interface MovieApi extends BaseApi<Movie> {
}
