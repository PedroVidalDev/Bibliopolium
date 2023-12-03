/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boker.infrastructure.migrations;

import com.mycompany.boker.infrastructure.ConnectionSQL;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class CreateTableLivros {
    
    public void createProdutos() throws Exception, SQLException{
        ConnectionSQL connectionSQL = new ConnectionSQL();
        Connection conn = connectionSQL.connect();
    
        PreparedStatement preparedStatement;
    
        String query = "create table if not exists livros (id int AUTO_INCREMENT, titulo varchar(255) NOT NULL, autor varchar(255) NOT NULL, isbn varchar(255) NOT NULL, editora varchar(255) NOT NULL, genero varchar(255) NOT NULL, ano varchar(255) NOT NULL, PRIMARY KEY(id));";
    
        preparedStatement = conn.prepareStatement(query);
        preparedStatement.execute();

        System.out.println("Tabela criada!");
    }
    
}
