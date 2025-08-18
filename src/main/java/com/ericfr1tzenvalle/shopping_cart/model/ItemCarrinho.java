package com.ericfr1tzenvalle.shopping_cart.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ItemCarrinho {
    @NotNull
    private Produto produto;
    @Min(1)
    private int quantidade;

    public ItemCarrinho(Produto produto) {
        this(produto, 1);
    }

    public ItemCarrinho(Produto produto, int quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if(produto == null) return;
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.quantidade = quantidade;
    }
}
