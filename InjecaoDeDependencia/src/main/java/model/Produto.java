package model;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal valor;

    public Produto(String nome, BigDecimal valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public BigDecimal getValor(){
        return this.valor;
    }

}
