package com.projeto.service;


import com.projeto.repository.entity.Jogador;
import com.projeto.repository.entity.Monstro;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BatalhaService {

    //PRECISA REFORMAR ISSO (QUANDO O USUARIO MORRER VAI CRIAR UM NOVO RETORNO, PRA PODER MUDAR A COR.)
    public String monstroAtaque(Jogador jogador, Monstro monstro){
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 11);
        if (resultado == 10) {
            jogador.setHP(jogador.getHP() - 100);
            return "\nMonstro realizou a Ultimate "+ monstro.getNomeUltimate() + "!!!!\n" ;
        }else{
            jogador.setHP(jogador.getHP() - 30);
            if (jogador.getHP() > 0){
                return "Monstro Atacou!!! \n\n\n" + "Jogador perdeu 30 HP com o " + monstro.getNomeAtaque();
            }else{
                return "Jogador perdeu 30 HP com o ataque " + monstro.getNomeAtaque() ;
            }
        }
        }
    public String jogadorAtaque(Monstro monstro){
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 3);
        if (resultado == 1){
            monstro.setHP(monstro.getHP() - 70);
            if(monstro.getHP() < 0){
                return "ATAQUE CRÍTICO\n\n\n";
            }else{
            return "ATAQUE CRÍTICO!!!!! \n\n\n Monstro perdeu 70 de HP";
            }
        }else{
        monstro.setHP(monstro.getHP() - 30);
        return "Ataque Realizado!! \n\n\n Monstro perdeu 30 de HP";
        }
    }
    //

    public String batalha(){
        return "battles/index";
    }
    public String iniciarJogo(JogadorService jogadorService, MonstroService monstroService){
        jogadorService.resetar();
        monstroService.resetar();
        monstroService.gerarMonstroAleatorio();
        return "redirect:/batalha/";
    }
    public String finalizar(){
        return "finalizar/index";
    }
    public String reset(boolean turnoDoJogador){
        turnoDoJogador = true;
        return "";
    }

}
