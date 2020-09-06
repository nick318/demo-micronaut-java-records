package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/create")
public class TestController {

    @Post(produces = MediaType.APPLICATION_JSON)
    public ResponseDto createList(@Body RequestDto requestDto) {
        return new ResponseDto();
    }
}
