package com.example.service.api;

import org.springframework.beans.factory.annotation.Autowired;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public abstract class AbstractController {

    @Autowired
    private MeterRegistry registry;

    Counter getCounter;

    Counter putCounter;

    Counter postCounter;

    Counter deleteCounter;

    public Counter getCounter(String key, String value) {
        return Counter
            .builder("controller.home")
            .tag("request", "get")
            .tag(key, value)
            .description("Number of GET requests")
            .register(registry);
    }

    public Counter putCounter(String key, String value) {
        return Counter
            .builder("controller.home")
            .tag("request", "put")
            .tag(key, value)
            .description("Number of PUT requests")
            .register(registry);
    }

    public Counter postCounter(String key, String value) {
        return Counter
            .builder("controller.home")
            .tag("request", "post")
            .tag(key, value)
            .description("Number of POST requests")
            .register(registry);
    }

    public Counter deleteCounter(String key, String value) {
        return Counter
            .builder("controller.home")
            .tag("request", "delete")
            .tag(key, value)
            .description("Number of DELETE requests")
            .register(registry);
    }

}
