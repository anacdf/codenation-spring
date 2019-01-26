package com.example.biblioteca.repository;

import com.example.biblioteca.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, String> {

    public Livro findLivroByNome(String nome);
}
