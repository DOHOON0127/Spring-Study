package com.example.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/get-api")
public class DeleteController {
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @DeleteMapping("delete/{variable}")
    public String DeleteVariable1(@PathVariable String variable) {
        return variable;
    }
}
