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

    @PutMapping("ataqueJogador")
    public String ataquejogador(@RequestParam int dano){
        return batalhaService.jogadorAtaque(monstroService.getmonstroAtual(), dano ) + "\n" + monstroService.getStatus() ;
    }
    @PutMapping("ataqueMonstro")
    public String ataqueMonstro(){
        return batalhaService.monstroAtaque(jogadorService.getJogador(),monstroService.getmonstroAtual());
    }
    @GetMapping("home")
    public String home(){
        return "home/index";
    }


    @GetMapping("banshee")
    public String bansheeBattle(){
        return "battles/banshee/index";
    }
    @GetMapping("dragao")
    public String dragaoBattle(){
        return "battles/dragao/index";
    }
}