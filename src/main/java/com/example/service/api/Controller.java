package com.example.service.api;

import com.example.service.models.Model;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping(value = "/")
public class Controller extends AbstractController {

    @Timed(value = "controller.home", description = "Timer of GET requests", histogram = true,
           percentiles = {.25, .50, .75}, extraTags = {"request", "get"})
    @RequestMapping(value = "", method = RequestMethod.GET,
                    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Model get(@RequestParam(required = false, defaultValue = "title") String title) {
        String[] tags = new String[] {"request", "get", "title", title};
        counter = counter("controller.home", "Number of GET requests", tags);
        counter.increment();

        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @Timed(value = "controller.home", description = "Timer of PUT requests", histogram = true,
           percentiles = {.25, .50, .75}, extraTags = {"request", "put"})
    @RequestMapping(value = "", method = RequestMethod.PUT,
                    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Model put(@RequestParam(required = false, defaultValue = "title") String title) {
        String[] tags = new String[] {"request", "put", "title", title};
        counter = counter("controller.home", "Number of PUT requests", tags);
        counter.increment();

        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @Timed(value = "controller.home", description = "Timer of POST requests", histogram = true,
           percentiles = {.25, .50, .75}, extraTags = {"request", "post"})
    @RequestMapping(value = "", method = RequestMethod.POST,
                    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Model post(@RequestParam(required = false, defaultValue = "title") String title) {
        String[] tags = new String[] {"request", "post", "title", title};
        counter = counter("controller.home", "Number of POST requests", tags);
        counter.increment();
        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @Timed(value = "controller.home", description = "Timer of DELETE requests", histogram = true,
           percentiles = {.25, .50, .75}, extraTags = {"request", "delete"})
    @RequestMapping(value = "", method = RequestMethod.DELETE,
                    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Model delete(@RequestParam(required = false, defaultValue = "title") String title) {
        String[] tags = new String[] {"request", "delete", "title", title};
        counter = counter("controller.home", "Number of DELETE requests", tags);
        counter.increment();

        Model model = new Model();
        model.setTitle(title);
        return model;
    }

}
