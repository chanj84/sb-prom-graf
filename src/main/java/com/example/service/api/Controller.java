package com.example.service.api;

import com.example.service.models.Model;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller extends AbstractController {

    @RequestMapping(value = "",
                    method = RequestMethod.GET,
                    consumes = MediaType.ALL_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Model get(@RequestParam(required = false, defaultValue = "title") String title) {
        getCounter = getCounter("title", title);
        getCounter.increment();
        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @RequestMapping(value = "",
                    method = RequestMethod.PUT,
                    consumes = MediaType.ALL_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Model put(@RequestParam(required = false, defaultValue = "title") String title) {
        putCounter = putCounter("title", title);
        putCounter.increment();
        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @RequestMapping(value = "",
                    method = RequestMethod.POST,
                    consumes = MediaType.ALL_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Model post(@RequestParam(required = false, defaultValue = "title") String title) {
        postCounter = postCounter("title", title);
        postCounter.increment();
        Model model = new Model();
        model.setTitle(title);
        return model;
    }

    @RequestMapping(value = "",
                    method = RequestMethod.DELETE,
                    consumes = MediaType.ALL_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Model delete(@RequestParam(required = false, defaultValue = "title") String title) {
        deleteCounter = deleteCounter("title", title);
        deleteCounter.increment();
        Model model = new Model();
        model.setTitle(title);
        return model;
    }

}
