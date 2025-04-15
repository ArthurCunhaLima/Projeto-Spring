package com.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET ,value = "/monstros")
public class MonstroController {

    @GetMapping
    public String listarMonstros() {
        return "LISTANDO OS MONSTROS...";
    }
}
