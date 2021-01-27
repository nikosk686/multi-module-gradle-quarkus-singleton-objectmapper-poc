package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
public class ExampleService {

    private final ObjectMapper jsonObjectMapper;
    private final ObjectMapper xmlObjectMapper;

    @Inject
    public ExampleService(@Named("jsonObjectMapper") ObjectMapper jsonObjectMapper,
                          @Named("xmlObjectMapper") ObjectMapper xmlObjectMapper) {
        this.jsonObjectMapper = jsonObjectMapper;
        this.xmlObjectMapper = xmlObjectMapper;
    }

    public String hello(Object input) throws JsonProcessingException {
        return "From local module:\n[jsonMapper:" + jsonObjectMapper +
                ", output: " + jsonObjectMapper.writeValueAsString(input) + "\n" +
                "xmlMapper:" + xmlObjectMapper + ", output: " + xmlObjectMapper.writeValueAsString(input);
    }
}