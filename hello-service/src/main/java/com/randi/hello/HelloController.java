package com.randi.hello;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.*;
import io.micronaut.http.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/hello")
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Produces(MediaType.APPLICATION_JSON)
    @Get("/get/{name}")
    public String getHello(String name) {
        return  "{ \"response\" : \"Hello "+name+" \"}";
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Post("/post")
    public String postHello(@Body Hello hello) {
        String name =  hello.getName();
        LOGGER.info("[Hello Controller] Name is {}.",name);
        return  "{ \"response\" : \"Hello "+name+" \"}";
    }
}
