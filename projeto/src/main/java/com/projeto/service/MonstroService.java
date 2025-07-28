package com.projeto.service;


import com.projeto.repository.entity.Monstro;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class MonstroService {

    private Monstro monstroAtual;


    private static final List<String> arrayNomesMonstros = Arrays.asList(
            "Dragão Flamejante",
            "Espectro Sombrio",
            "Górgona Petrificadora",
            "Kraken Abissal",
            "Golem de Obsidiana",
            "Banshee Lamentosa",
            "Hidra Venenosa"
    );
    private static final List<String> arrayEndPointMonstros = Arrays.asList(
            "dragao",
            "espectro",
            "gorgona",
            "kraken",
            "golem",
            "banshee",
            "hidra"
    );
    private static final List<Integer> arrayHP = Arrays.asList(
            180,
            150,
            160,
            200,
            190,
            170,
            180
    );
    private static final List<String> arrayNomesAtaques = Arrays.asList(
            "Sopro de Fogo",
            "Toque Sombrio",
            "Olhar Petrificante",
            "Tentáculo Sugador",
            "Esmagamento Rochoso",
            "Grito Agudo",
            "Baforada Tóxica"
    );
    private static final List<String> arrayNomesUltimates = Arrays.asList(
            "Garra Flamejante",
            "Assombração Lancinante",
            "Mordida Venenosa",
            "Tempestade Marinha",
            "Colisão Sísmica",
            "Lamento Fantasmagórico",
            "Mordida Venenosa"
    );

    public String gerarMonstroAleatorio(){
        if (monstroAtual == null || monstroAtual.Vivo() == false){
        Random aleatorizar = new Random();
        int dadoMonstro = aleatorizar.nextInt(arrayNomesMonstros.size()-1);

        Monstro monstro = new Monstro();
        monstro.setEndpoint(arrayEndPointMonstros.get(dadoMonstro));
        monstro.setNome(arrayNomesMonstros.get(dadoMonstro));
        monstro.setHP(arrayHP.get(dadoMonstro));
        monstro.setNomeAtaque(arrayNomesAtaques.get(dadoMonstro));
        monstro.setNomeUltimate(arrayNomesUltimates.get(dadoMonstro));
        this.monstroAtual = monstro;
        return "Monstro Criado!!";
        }
        else{
            return "Monstro já existe!!";
        }
    }
    public Monstro getmonstroAtual(){
        return this.monstroAtual;
        }

    public void resetar() {
        this.monstroAtual = null;
    }

    public String getStatus(){
        if (!monstroAtual.Vivo() || monstroAtual.getHP() <= 0){
            this.monstroAtual = null;
            return "\n\nMonstro Morreu!!";
        }else {
            return "";
        }
    }
    public String retornar(){
        return getmonstroAtual().toString();
    }
    public int retornarHP(){
        return getmonstroAtual().getHP();
    }
    public String retornarNome(){
        return getmonstroAtual().getNome();
    }
    public String retornarEndpoint(){
        return getmonstroAtual().getEndpoint();
    }




}

