package com.projeto.controller;

import com.projeto.service.BatalhaService;
import com.projeto.service.JogadorService;
import com.projeto.service.MonstroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("batalha")
public class BatalhaController {
    private final MonstroService monstroService;
    private final JogadorService jogadorService;
    private final BatalhaService batalhaService;


    public BatalhaController (JogadorService jogadorService, MonstroService monstroService, BatalhaService batalhaService){
        this.monstroService = monstroService;
        this.jogadorService = jogadorService;
        this.batalhaService = batalhaService;
    }

    @GetMapping("/")
    public String batalhaMonstro() {
        return batalhaService.batalha();
    }

    @GetMapping("/iniciar-jogo")
    public String iniciarJogo() {
        return batalhaService.iniciarJogo(jogadorService,monstroService);
    }

    @GetMapping("finalizar")
    public String finalizar(){
        return batalhaService.finalizar();
    }
}