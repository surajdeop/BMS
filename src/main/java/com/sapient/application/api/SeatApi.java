package com.sapient.application.api;

import com.sapient.data.model.Seat;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/seat")
@Api(tags = "seat-api")
public interface SeatApi extends BaseApi<Seat>{
}
