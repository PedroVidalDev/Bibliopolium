/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boker.domain;

import com.mycompany.boker.application.dto.LivroDTO;
import com.mycompany.boker.infrastructure.daos.LivroDAO;
import com.mycompany.boker.infrastructure.entities.Livro;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class LivroService {
    public void criarLivro(LivroDTO dto) throws SQLException, Exception{
        LivroDAO dao = new LivroDAO();
        dao.create(new Livro(dto));
    }
    
    public LivroDTO resgatarLivro(String isbn)throws SQLException, Exception{
        LivroDAO dao = new LivroDAO();
        
        return new LivroDTO(dao.get(isbn));
    }
}
