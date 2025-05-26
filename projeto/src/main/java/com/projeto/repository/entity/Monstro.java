package com.projeto.repository.entity;

import jakarta.persistence.*;


@Entity
public class Monstro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int HP;
    private String nomeUltimate;
    private int danoUltimate = 100;
    private String nomeAtaque;
    private int danoAtaque = 30;
    private String endpoint;


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getNomeUltimate() {
        return nomeUltimate;
    }

    public void setNomeUltimate(String nomeUltimate) {
        this.nomeUltimate = nomeUltimate;
    }

    public int getDanoUltimate() {
        return danoUltimate;
    }

    public void setDanoUltimate(int danoUltimate) {
        this.danoUltimate = danoUltimate;
    }

    public String getNomeAtaque() {
        return nomeAtaque;
    }

    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    public boolean Vivo(){
        return HP > 0;
    }

    @Override
    public String toString(){
        return "nome : "+ this.nome + "\n" +
                "HP : " + this.HP + "\n" +
                "NomeAtaque : " + this.nomeAtaque + "\n" +
                "DanoAtaque : " + this.danoAtaque + "\n" +
                "nomeUltimate : " + this.nomeUltimate + "\n" +
                "DanoUltimate : " + this.danoUltimate + "\n" +
                "Endpoint : " + this.endpoint;

    }
}

