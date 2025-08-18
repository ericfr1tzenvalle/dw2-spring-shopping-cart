package com.ericfr1tzenvalle.shopping_cart.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens;
    private double precoTotal;
    private int quantidadeTotal;
    
    public Carrinho() {
        this.itens = new ArrayList<ItemCarrinho>();
        this.precoTotal = 0;
        this.quantidadeTotal = 0;
    }
    public List<ItemCarrinho> getItens() {
        return itens;
    }
    public void addItem(ItemCarrinho item){
        if(item == null) return;
        ItemCarrinho itemAtual = getItem(item);
        if(itemAtual == null){
            itens.add(item);
            return;
        }
        itemAtual.setQuantidade(itemAtual.getQuantidade() + item.getQuantidade());
    }
    public ItemCarrinho getItem(ItemCarrinho itemBuscado) {
        for(ItemCarrinho item : itens) {
            if(item.getProduto().getId().equals(itemBuscado.getProduto().getId())) {
                return item;
            }
        }
        return null;
    }
    public double getPrecoTotal() {
        double precoTotal = 0;
        for(ItemCarrinho item : itens) {
            precoTotal += item.getProduto().getPreco() * item.getQuantidade();
        }
        return precoTotal;
    }
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    public int getQuantidadeTotal() {
        int quantidadeTotal = 0;
        for(ItemCarrinho item : itens) {
            quantidadeTotal += item.getQuantidade();
        }
        return quantidadeTotal;
    }
    
}
