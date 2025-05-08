package com.projeto.controller;

import com.projeto.repository.entity.Jogador;
import com.projeto.repository.entity.Monstro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping(value = "monstro")
public class MonstroController {
    Monstro monstro = new Monstro();
    Jogador jogador = new Jogador();
    @GetMapping(value = "retornar/monstro")
    public String retornarMonstro() {
        return monstro.toString();
    }
    @GetMapping("retornar/jogador")
    public String retornarJogador(){
        return jogador.toString() ;
    }
    @PutMapping("ataque")
    public String monstroAtaque() {
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 20);
        if (resultado == 10) {
            jogador.setHP(jogador.getHP() - 100);
            return "ULTIMATE!!!!! \n" + "Jogador Eliminado";
    }else{
        jogador.setHP(jogador.getHP() - 30);
        if (jogador.getHP() > 0){
        return "Monstro Atacou!!! \n" + "Jogador perdeu 30 HP com o ataque de " + monstro.getNome() + ", agora você está com " + jogador.getHP();
        }else{
        return "Jogador perdeu 30 HP com o ataque de " + monstro.getNome() + " e foi eliminado";
        }
        }
    }
}
