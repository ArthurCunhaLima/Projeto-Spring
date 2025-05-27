package com.projeto.controller;


import com.projeto.service.BatalhaService;
import com.projeto.service.JogadorService;
import com.projeto.service.MonstroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("batalharetorno")
public class BatalhaRestController {

    private boolean turnoDoJogador = true;

    private final MonstroService monstroService;
    private final JogadorService jogadorService;
    private final BatalhaService batalhaService;

    public BatalhaRestController (JogadorService jogadorService, MonstroService monstroService, BatalhaService batalhaService){
        this.monstroService = monstroService;
        this.jogadorService = jogadorService;
        this.batalhaService = batalhaService;
    }
    @PutMapping("ataqueJogador")
    public String ataquejogador(){
        return batalhaService.jogadorAtaque(monstroService.getmonstroAtual()) + "\n" + monstroService.getStatus() ;
    }
    @PutMapping("ataqueMonstro")
    public String ataqueMonstro(){
        return batalhaService.monstroAtaque(jogadorService.getJogador(),monstroService.getmonstroAtual());
    }

    @PutMapping("/turno")
    public String turno() {
        String resultado;

        if (turnoDoJogador) {
            resultado = batalhaService.jogadorAtaque(monstroService.getmonstroAtual());
            resultado += jogadorService.getStatus();
        } else {
            resultado = batalhaService.monstroAtaque(jogadorService.getJogador(), monstroService.getmonstroAtual());
            resultado += monstroService.getStatus();
        }

        turnoDoJogador = !turnoDoJogador;

        return resultado;
    }
    @PostMapping("/reset")
    public String resetTurno() {
        turnoDoJogador = true;
        return "";
    }


}
