package com.ericfr1tzenvalle.shopping_cart.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens;

    
    public Carrinho() {
        this.itens = new ArrayList<ItemCarrinho>();

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
        return itens.stream().mapToDouble(item -> item.getProduto().getPreco() * item.getQuantidade()).sum();
    }

    public int getQuantidadeTotal() {
        return itens.stream().mapToInt(ItemCarrinho::getQuantidade).sum();
    }
    
}
