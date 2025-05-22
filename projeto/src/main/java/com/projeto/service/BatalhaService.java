package com.projeto.service;


import com.projeto.repository.entity.Jogador;
import com.projeto.repository.entity.Monstro;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BatalhaService {
    public String monstroAtaque(Jogador jogador, Monstro monstro){
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 20);
        if (resultado == 10) {
            jogador.setHP(jogador.getHP() - 100);
            return "Monstro realizou um "+ monstro.getNomeUltimate() + "!!!!\n" +  "Jogador Eliminado";
        }else{
            jogador.setHP(jogador.getHP() - 30);
            if (jogador.getHP() > 0){
                return "Monstro Atacou!!! \n" + "Jogador perdeu 30 HP com o ataque de " + monstro.getNome() + ", agora você está com " + jogador.getHP();
            }else{
                return "Jogador perdeu 30 HP com o ataque de " + monstro.getNome() + " e foi eliminado";
            }
        }
        }
    public String jogadorAtaque(Monstro monstro, int dano){
        monstro.setHP(monstro.getHP() - dano);
        return "Ataque Realizado!! \nHP do Monstro :" + monstro.getHP();
    }


}
