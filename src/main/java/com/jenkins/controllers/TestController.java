package com.jenkins.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController{


    @RequestMapping("/")
    public Map<String, Object> getValues(){
        Map<String, Object> data = new HashMap();
        data.put("message","This is SpringBoot project for testing using Docker");
        data.put("langauge", Arrays.asList("Java","Python","JavaScript"));
        data.put("code",1818);
        return data;
    }

//msg string,language array,code int
}
