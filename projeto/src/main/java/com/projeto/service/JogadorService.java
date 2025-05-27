package com.projeto.service;


import com.projeto.repository.entity.Jogador;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {


    public JogadorService(){
        this.jogador = new Jogador();
    }
    private Jogador jogador;

    public Jogador getJogador(){
        return this.jogador;
    }

    public String getStatus(){
        if (!jogador.Vivo() || jogador.getHP() <= 0){
            this.jogador = null;
            return "Jogador Perdeu, Fim de Jogo";
        }else {
            return "";
        }
    }


    public int getJogadorHP() {
        return getJogador().getHP();
    }
}
