/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boker.application.dto;

import com.mycompany.boker.infrastructure.entities.Livro;

/**
 *
 * @author pedro
 */
public record LivroDTO (
        String titulo,
        String autor,
        String isbn,
        String editora,
        String genero,
        String ano
        ){
    public LivroDTO(Livro data){
        this(data.getTitulo(), data.getAutor(), data.getISBN(), data.getEditora(), data.getGenero(), data.getAno());
    }
}
