package com.example.biblioteca.service;

import com.example.biblioteca.entity.Livro;
import com.example.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarTodosLivros(){
        return livroRepository.findAll();
    }

    public Livro buscarLivroPorNome(String nome){
        return livroRepository.findLivroByNome(nome);
    }
}
