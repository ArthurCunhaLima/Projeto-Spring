package com.projeto.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class Jogador {
    private int HP;

    public Jogador(){
        this.HP = 100;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "HP : " + this.HP;
    }
}
