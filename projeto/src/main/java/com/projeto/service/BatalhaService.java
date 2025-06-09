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
            jogador.setHP(jogador.getHP() - 100);
            return "\nMonstro realizou um "+ monstro.getNomeUltimate() + "!!!!\n" +  "\n\nJogador Eliminado";
        }else{
            jogador.setHP(jogador.getHP() - 30);
            if (jogador.getHP() > 0){
                return "Monstro Atacou!!! \n" + "Jogador perdeu 30 HP com o ataque " + monstro.getNomeAtaque() + ", agora você está com " + jogador.getHP() + "HP!";
            }else{
                return "Jogador perdeu 30 HP com o ataque " + monstro.getNomeAtaque() + " e foi eliminado";
            }
        }
        }
    public String jogadorAtaque(Monstro monstro){
        Random girarDado = new Random();
        int resultado = girarDado.nextInt(1, 3);
        if (resultado == 1){
            monstro.setHP(monstro.getHP() - 70);
            if(monstro.getHP() < 0){
                return "VOCê DEU UM ATAQUE CRÍTICO, ELIMINANDO O MONSTRO!!!!!";
            }else{
            return "VOCê DEU UM ATAQUE CRÍTICO!!!!! \nHP do Monstro :" + monstro.getHP();
            }
        }else{
        monstro.setHP(monstro.getHP() - 30);
        return "Ataque Realizado!! \nHP do Monstro :" + monstro.getHP();
        }
    }


}
