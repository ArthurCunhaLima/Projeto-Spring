package com.projeto.service;


import com.projeto.repository.entity.Jogador;
import com.projeto.repository.entity.Monstro;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BatalhaService {
    public String monstroAtaque(Jogador jogador, Monstro monstro){
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 11);
        if (resultado == 10) {
            jogador.setHP(Math.max(0, jogador.getHP() - 100));
            return "Monstro realizou um "+ monstro.getNomeUltimate() + "!!!!\n" +  "Jogador Eliminado";
        }else{
            jogador.setHP(Math.max(0, jogador.getHP() - 30));
            if (jogador.getHP() > 0){
                return "Monstro Atacou!!! \n" + "Jogador perdeu 30 HP com o ataque de " + monstro.getNomeAtaque() + ", agora você está com " + jogador.getHP();
            }else{
                return "Jogador perdeu 30 HP com o ataque de " + monstro.getNomeAtaque() + " e foi eliminado";
            }
        }
        }
    public String jogadorAtaque(Monstro monstro) {
        if (monstro == null || monstro.getHP() <= 0) {
            return "O monstro já foi derrotado!";
        }

        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 3);
        if (resultado == 1) {
            monstro.setHP(Math.max(0, monstro.getHP() - 70));
            if (monstro.getHP() <= 0) {
                return "CRÍTICO!!!!! \nO monstro foi derrotado!";
            }
            return "CRÍTICO!!!!! \nHP do Monstro: " + monstro.getHP();
        } else {
            monstro.setHP(Math.max(0, monstro.getHP() - 30));
            if (monstro.getHP() <= 0) {
                return "Ataque Realizado!! \nO monstro foi derrotado!";
            }
            return "Ataque Realizado!! \nHP do Monstro: " + monstro.getHP();
        }
    }


}
