package com.github.willyancaetano.open.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/users/")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("José", "Maria");
    }
}