package com.programming.app.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MainApiController {

    @GetMapping("/map/list")
    public List<Map<String, Object>> mapList() {
        ArrayList<Map<String, Object>> resList = new ArrayList<>();
        return resList;
    }
}
