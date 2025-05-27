package com.projeto.controller;

import com.projeto.service.JogadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jogador")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("retornarHP")
    public int retornarHP() {
        if (jogadorService.getJogador() == null) {
            return 0; // Retorna 0 se não houver jogador atual
        }
        return jogadorService.getJogadorHP();
    }
}