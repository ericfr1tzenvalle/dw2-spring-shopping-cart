/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ericfr1tzenvalle.shopping_cart.model;

import com.ericfr1tzenvalle.shopping_cart.utils.Verificador;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;


/**
 *
 * @author Luísa
 */
public class Produto {
    private Long id;
    @NotBlank
    @Pattern(regexp = "^[^0-9]*$", message = "O nome não pode conter números")
    private String nome;
    @NotBlank(message = "A descrição não pode ser vazia")
    private String descricao;
    @Positive (message = "O preço tem que ser maior que zero")
    private double preco;

    public Produto(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;


    }

    public Produto() {

    }

    public Produto(long l, String nome, String descricao, double preco) {
        this.id=l;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




}
