package com.example.biblioteca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livros")
public class Livro {

    @Id
    Integer id;

    @Column(name = "nome")
    String nome;

    @Column(name = "descricao")
    String descricao;

    @Column(name = "autor")
    String autor;

    @Column(name = "editora")
    String editora;

    public Livro(){

    }

    public Livro(Integer id, String nome, String descricao, String autor, String editora) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.editora = editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
