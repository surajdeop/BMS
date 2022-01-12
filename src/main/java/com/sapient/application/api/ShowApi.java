package com.sapient.application.api;

import com.sapient.data.model.Show;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/show")
@Api(tags = "show-api")
public interface ShowApi extends BaseApi<Show> {
}
