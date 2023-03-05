package org.example.progettospringdataorm.db.dao.inteface.simple;

import org.example.progettospringdataorm.db.entity.Categoria;

public interface CategoriaDao {
    public Categoria retrieveForName(String nome);
    public String nomeById(int id);
}