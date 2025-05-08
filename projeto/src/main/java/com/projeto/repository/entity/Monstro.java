package com.projeto.repository.entity;

import jakarta.persistence.*;

import java.util.List;

import java.util.Arrays;
import java.util.Random;

@Entity
public class Monstro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private List<String> arrayNomesMonstros = Arrays.asList(
            "Dragão Flamejante",
            "Espectro Sombrio",
            "Górgona Petrificadora",
            "Kraken Abissal",
            "Golem de Obsidiana",
            "Banshee Lamentosa",
            "Hidra Venenosa"
    );
    private List<Integer> arrayHP = Arrays.asList(
            180,
            150,
            160,
            200,
            190,
            170,
            180
    );
    private List<String> arrayNomesAtaques = Arrays.asList(
            "Sopro de Fogo",
            "Toque Sombrio",
            "Olhar Petrificante",
            "Tentáculo Sugador",
            "Esmagamento Rochoso",
            "Grito Agudo",
            "Baforada Tóxica"
    );
    private List<String> arrayNomesUltimates = Arrays.asList(
            "Garra Flamejante",
            "Assombração Lancinante",
            "Mordida Venenosa",
            "Tempestade Marinha",
            "Colisão Sísmica",
            "Lamento Fantasmagórico",
            "Mordida Venenosa"
    );
    private String nome;
    private int HP;
    private String nomeUltimate;
    private int danoUltimate = 100;
    private String nomeAtaque;
    private int danoAtaque = 30;


    Random aleatorizar = new Random();
    public Monstro(){
        int dadoMonstro = aleatorizar.nextInt(arrayNomesMonstros.size()-1);
        this.nome = arrayNomesMonstros.get(dadoMonstro);
        this.HP = arrayHP.get(dadoMonstro);
        this.nomeUltimate = arrayNomesUltimates.get(dadoMonstro);
        this.nomeAtaque = arrayNomesAtaques.get(dadoMonstro);
    }

    public String getNome(){
        return this.nome;
    }

    public List<String> getArrayNomesMonstros(){
        return arrayNomesMonstros;
    }
    public int getHP(){
        return this.HP;
    }
    public void setHP(int novoHP){
        this.HP = novoHP;
    }
    public String getUltimate(){
        return this.nomeUltimate;
    }
    public int getDanoUltimate(){
        return this.danoUltimate;
    }
    public String getNomeAtaque(){
        return this.nomeAtaque;
    }
    public int getDanoAtaque(){
        return this.danoAtaque;
    }
    @Override
    public String toString(){
        return "nome : "+ this.nome + "\n" +
                "HP : " + this.HP + "\n" +
                "NomeAtaque : " + this.nomeAtaque + "\n" +
                "DanoAtaque : " + this.danoAtaque + "\n" +
                "nomeUltimate : " + this.nomeUltimate + "\n" +
                "DanoUltimate : " + this.danoUltimate + "\n";

    }
}

