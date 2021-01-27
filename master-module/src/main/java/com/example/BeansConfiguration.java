package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;

@ApplicationScoped
public class BeansConfiguration {

    @Singleton
    @Produces
    @Named("jsonObjectMapper")
    public ObjectMapper jsonObjectMapper() {
        return new ObjectMapper();
    }

    @Singleton
    @Produces
    @Named("xmlObjectMapper")
    public ObjectMapper xmlObjectMapper() {
        return new XmlMapper();
    }
}
