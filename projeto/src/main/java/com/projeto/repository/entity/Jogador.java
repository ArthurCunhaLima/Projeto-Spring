package com.projeto.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

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
    public boolean Vivo(){
        return HP > 0;
    }


    @Override
    public String toString() {
        return "HP : " + this.HP;
    }
}