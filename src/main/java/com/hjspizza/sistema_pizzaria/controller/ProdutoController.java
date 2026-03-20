package com.hjspizza.sistema_pizzaria.controller;

import com.hjspizza.sistema_pizzaria.model.Produto;
import com.hjspizza.sistema_pizzaria.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos") // Este é o endereço que você vai digitar no navegador
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listarTodas() {
        return repository.findAll(); // Pega tudo o que estiver no SQL e mostra na tela
    }
}