/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boker.infrastructure.daos;

import com.mycompany.boker.infrastructure.ConnectionSQL;
import com.mycompany.boker.infrastructure.migrations.CreateTableLivros;
import com.mycompany.boker.infrastructure.entities.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class LivroDAO {
    public void create(Livro livro) throws SQLException, Exception{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();

        CreateTableLivros createTableProduto = new CreateTableLivros();
        createTableProduto.createProdutos();

        PreparedStatement preparedStatement;

        String query = "INSERT INTO livros(titulo, autor, isbn, editora, genero, ano) values (?, ?, ?, ?, ?, ?)";

        preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, livro.getTitulo());
        preparedStatement.setString(2, livro.getAutor());
        preparedStatement.setString(3, livro.getISBN());
        preparedStatement.setString(4, livro.getEditora());
        preparedStatement.setString(5, livro.getGenero());
        preparedStatement.setString(6, livro.getAno());

        preparedStatement.execute();
    }

    public Livro get(String isbnInput)throws SQLException, Exception{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();

        PreparedStatement preparedStatement;

        String query = "select * from livros where isbn='" + isbnInput + "'";

        preparedStatement = conn.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();

        if(rs.next()){
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            String isbn = rs.getString("isbn");
            String editora = rs.getString("editora");
            String genero = rs.getString("genero");
            String ano = rs.getString("ano"); 
            
            return new Livro(titulo, autor, isbn, editora, genero, ano);
        }
        return null;
        
    }
}
