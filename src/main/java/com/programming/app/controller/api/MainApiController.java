package com.programming.app.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainApiController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello!!!!!";
    }

    @GetMapping("/map")
    public String mapList() {
        return "mapList";
    }

}