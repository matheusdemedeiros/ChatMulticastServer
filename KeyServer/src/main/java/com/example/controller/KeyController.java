package com.example.controller;

import com.example.KeyServer.Key;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//@SpringBootApplication
@RestController
public class KeyController {

    private String key = "minhakey";

    @RequestMapping(value = "/getKey", method = RequestMethod.GET)
    @ResponseBody
    public String getKey() {
        return key;
    }
}