package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Livro;
import com.example.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping("/livros")
    public List<Livro> retornarTodosLivros(){
        return livroService.buscarTodosLivros();
    }

    @GetMapping("/livro")
    public Livro retornarLivroPorNome(@PathVariable String nome){
        return livroService.buscarLivroPorNome(nome);
    }
}
