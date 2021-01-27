package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ApplicationScoped
public class ExampleServiceExternal {

    private final ObjectMapper jsonObjectMapper;
    private final ObjectMapper xmlObjectMapper;

    @Inject
    public ExampleServiceExternal(@Named("jsonObjectMapper") ObjectMapper jsonObjectMapper,
                                  @Named("xmlObjectMapper") ObjectMapper xmlObjectMapper) {
        this.jsonObjectMapper = jsonObjectMapper;
        this.xmlObjectMapper = xmlObjectMapper;
    }

    public String hello(Object input) throws JsonProcessingException {
        return "From external module:\n[jsonMapper:" + jsonObjectMapper +
                ", output: " + jsonObjectMapper.writeValueAsString(input) + "\n" +
                "xmlMapper:" + xmlObjectMapper + ", output: " + xmlObjectMapper.writeValueAsString(input);
    }
}