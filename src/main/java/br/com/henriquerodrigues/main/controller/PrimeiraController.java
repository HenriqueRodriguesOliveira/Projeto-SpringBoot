package br.com.henriquerodrigues.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Receber Requisição - processar e retornar para o user
@RequestMapping("/primeiraController") //Mapear solicitações para métodos de controladores.
public class PrimeiraController {
    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Meu primeiro metodo api rest";
    }
}
