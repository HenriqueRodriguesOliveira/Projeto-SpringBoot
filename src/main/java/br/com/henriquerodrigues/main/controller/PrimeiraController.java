package br.com.henriquerodrigues.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

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
        return "metodoComBodyParams " + usuario.username();
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader("name") Map<String, String> headers) {
        return "metodoComHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id) {
        var usuario = new Usuario("henriquerodrigues");

        if(id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Numero menor que 5");
    }

    record Usuario(String username) {
    }
}
