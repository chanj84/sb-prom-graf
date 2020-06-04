package com.example.service.api;

import org.springframework.beans.factory.annotation.Autowired;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public abstract class AbstractController {

    @Autowired
    private MeterRegistry registry;

    Counter counter;

    public Counter counter(String metric, String description, String... tags) {
        return counter = Counter.builder(metric).description(description).tags(tags).register(registry);
    }

}
