/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boker.infrastructure.entities;

import com.mycompany.boker.application.dto.LivroDTO;

/**
 *
 * @author pedro
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String editora;
    private String genero;
    private String ano;

    public Livro(String titulo, String autor, String isbn, String editora, String genero, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.genero = genero;
        this.ano = ano;
    }

    public Livro(LivroDTO data){
        this.titulo = data.titulo();
        this.autor = data.autor();
        this.isbn = data.isbn();
        this.editora = data.editora();
        this.genero = data.genero();
        this.ano = data.ano();
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getISBN(){
        return isbn;
    }

    public String getEditora(){
        return editora;
    }

    public String getGenero(){
        return genero;
    }

    public String getAno(){
        return ano;
    }
}
