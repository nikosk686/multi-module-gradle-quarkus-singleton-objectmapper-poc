package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
class ExampleServiceExternalTest {

    @Inject
    ExampleService exampleService;
    @Inject
    ExampleServiceExternal exampleServiceExternal;

    @Test
    void testHello() throws JsonProcessingException {
        ExampleInputExternal input = new ExampleInputExternal(2L, "nikos-module-1");
        System.out.println(exampleServiceExternal.hello(input) + "\n" + exampleService.hello(input));
    }
}