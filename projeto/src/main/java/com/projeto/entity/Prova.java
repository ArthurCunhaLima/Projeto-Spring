package com.projeto.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Prova {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int questoes;

    @Column(nullable = false)
    private String assunto;

    @OneToMany(mappedBy = "prova", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Questao> questoesList;

    public Prova(){
    }

    public Prova(String nome,int questoes,String assunto){
        this.nome = nome;
        this.questoes = questoes;
        this.assunto = assunto;
    }

    public long getID(){
        return this.id;
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getQuestoes(){
        return this.questoes;
    }
    public void setQuestoes(){
        this.questoes = questoes;
    }


    public String getAssunto(){
        return this.assunto;
    }
    public void setAssunto(String assunto){
        this.assunto = assunto;
    }


    public List<Questao> getQuestoesList() {
        return questoesList;
    }
    public void setQuestoesList(List<Questao> questoesList) {
        this.questoesList = questoesList;
    }


}
