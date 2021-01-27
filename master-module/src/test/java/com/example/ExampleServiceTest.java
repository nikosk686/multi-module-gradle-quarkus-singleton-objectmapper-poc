package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
class ExampleServiceTest {

    @Inject
    ExampleService exampleService;

    @Test
    void testHello() throws JsonProcessingException {
        System.out.println(exampleService.hello(new ExampleInputLocal(1L, "nikos")));
    }
}