package com.projeto.controller;

import com.projeto.service.JogadorService;
import com.projeto.service.MonstroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("batalha")
public class BatalhaController {
    private final MonstroService monstroService;
    private final JogadorService jogadorService;

    public BatalhaController(JogadorService jogadorService, MonstroService monstroService) {
        this.monstroService = monstroService;
        this.jogadorService = jogadorService;
    }

    @GetMapping("home")
    public String home() {
        return "home/index";
    }

    @GetMapping("/iniciar-jogo")
    public String iniciarJogo() {
        jogadorService.resetar();
        monstroService.resetar();

        monstroService.gerarMonstroAleatorio();
        String nomePaginaMonstro = monstroService.getmonstroAtual().getEndpoint();
        return "redirect:/batalha/" + nomePaginaMonstro;
    }

    @GetMapping("{nomeMonstro}")
    public String batalhaMonstro(@PathVariable String nomeMonstro) {
        if (monstroService.getmonstroAtual().getHP() <= 0) {
            return "redirect:/batalha/finalizar";
        }
        return "battles/" + nomeMonstro + "/index";
    }

    @GetMapping("finalizar")
    public String finalizar() {
        return "finalizar/index";
    }
}