package org.example.progettospringdataorm.db.entity;


import javax.persistence.*;

@Entity
public class Prodotto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nome;
    private Categoria categoria;
    private String descrizione;

    @Column(name="prezzo_unitario")
    private int prezzoUnitario;

    @Column(name="unita_di_misura")
    private String unitaDiMisura;

    public Prodotto() {
    }

    public Prodotto(int id, String nome, Categoria categoria, String descrizione, int prezzoUnitario, String unitaDiMisura) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
        this.unitaDiMisura = unitaDiMisura;
    }

    public Prodotto(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    public int getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(int prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getUnitaDiMisura() {
        return unitaDiMisura;
    }

    public void setUnitaDiMisura(String unitaDiMisura) {
        this.unitaDiMisura = unitaDiMisura;
    }
}