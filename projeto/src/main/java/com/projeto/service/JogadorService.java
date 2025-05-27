package com.projeto.service;


import com.projeto.repository.entity.Jogador;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    private Jogador jogadorAtual;

    public Jogador getJogador() {
        return jogadorAtual;
    }

    public String getStatus() {
        if (jogadorAtual == null) {
            return "Jogador não encontrado.";
        }
        return "HP do Jogador: " + jogadorAtual.getHP();
    }

    public void resetar() {
        jogadorAtual = new Jogador();
        jogadorAtual.setHP(100);
    }

    public int getJogadorHP() {
        if (jogadorAtual == null) {
            return 0;
        }
        return jogadorAtual.getHP();
    }
}
