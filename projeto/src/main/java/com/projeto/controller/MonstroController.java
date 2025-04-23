package com.projeto.controller;

import com.projeto.repository.entity.Monstro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonstroController {
    Monstro monstro = new Monstro();
    @GetMapping(value = "/testar")
    public String Monstro(){

    }
    public String listarMonstros() {
        return "LISTANDO OS MONSTROS...";
    }
}
