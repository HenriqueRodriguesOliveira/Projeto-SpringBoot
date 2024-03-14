package br.com.henriquerodrigues.main.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController  //Receber Requisição - processar e retornar para o user
@RequestMapping("/primeiraController") //Mapear solicitações para métodos de controladores.
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametró é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "O parametró com metodoComQueryParams é " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams(@RequestParam Map<String, String> allParams) {
        return "O parametró com metodoComQueryParams é " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams" + usuario.username();
    }

    record Usuario(String username) {

    }
}
