package com.sapient.application.api;

import com.sapient.data.model.Screen;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/screen")
@Api(tags = "screen-api")
public interface ScreenApi extends BaseApi<Screen>{
}
