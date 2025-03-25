package com.projeto.entity;

import jakarta.persistence.*;

@Entity
public class Questao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String enunciado;

    @Column(nullable = false)
    private String alternativaA;
    @Column(nullable = false)
    private String alternativaB;

    private String alternativaC;

    private String alternativaD;

    private String alternativaE;

    @ManyToOne
    @JoinColumn(name = "prova_id", nullable = false)
    private Prova prova;

    public Questao(){
    }


    public Questao(String enunciado, String alternativaA, String alternativaB, String alternativaC, String alternativaD, String alternativaE){
        this.enunciado = enunciado;
        this.alternativaA = alternativaA;
        this.alternativaB = alternativaB;
        this.alternativaC = alternativaC;
        this.alternativaD = alternativaD;
        this.alternativaE = alternativaE;
    }

    public String getEnunciado(){
        return this.enunciado;
    }
    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }
    public String getAlternativaA(){
        return  this.alternativaA;
    }
    public void setAlternativaA(String AlternativaA){
        this.alternativaA = alternativaA;
    }
    public String getAlternativaB(){
        return  this.alternativaB;
    }
    public void setAlternativaB(String AlternativaB){
        this.alternativaA = alternativaB;
    }
    public String getAlternativaC(){
        return  this.alternativaC;
    }
    public void setAlternativaC(String AlternativaC){
        this.alternativaC = alternativaC;
    }
    public String getAlternativaD(){
        return  this.alternativaD;
    }
    public void setAlternativaD(String AlternativaD){
        this.alternativaD = alternativaD;
    }
    public String getAlternativaE(){
        return  this.alternativaE;
    }
    public void setAlternativaE(String AlternativaE){
        this.alternativaE = alternativaE;
    }


}
