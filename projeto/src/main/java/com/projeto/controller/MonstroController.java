package com.projeto.controller;


import com.projeto.service.MonstroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "monstro")
public class MonstroController {
    private final MonstroService monstroService;

    public MonstroController(MonstroService monstroService) {
        this.monstroService = monstroService;
    }

    @GetMapping(value = "gerar")
    public String gerarMonstro() {
        return monstroService.gerarMonstroAleatorio();
    }
    @GetMapping("retornar")
    public String retornarMonstro(){
        return monstroService.retornar();
    }
    @GetMapping("retornarHP")
    public int retornarHP(){
        return monstroService.retornarHP();
    }

    @GetMapping("retornarNome")
    public String retornarNome(){
        return monstroService.retornarNome();
    }
    @GetMapping("retornarEndpoint")
    public String retornarEndpoint(){
        return monstroService.retornarEndpoint();
    }

}
