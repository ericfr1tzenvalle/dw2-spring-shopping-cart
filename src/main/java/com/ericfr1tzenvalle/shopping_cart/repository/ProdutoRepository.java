package com.ericfr1tzenvalle.shopping_cart.repository;

import com.ericfr1tzenvalle.shopping_cart.model.Produto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepository {
    // Utilizei Lambdas e Streams porque é bem mais legivel e moderno
    private final List<Produto> produtos = new ArrayList<>();
    private long proximoId = 1;

    // Busca um produto pelo ID
    public Produto buscarPeloId(Long id) {
        if (id == null) return null;
        return produtos.stream()
                .filter(p -> id.equals(p.getId()))
                .findFirst() // Retorna o primeiro
                .orElse(null); // Se não retorna null
    }

    // Verifica se já existe um produto com o mesmo nome (case-insensitive)
    public boolean existePeloNome(String nome) {
        if (nome == null) return false;
        return produtos.stream()
                .anyMatch(p -> p.getNome().equalsIgnoreCase(nome)); // Se algum dos produtos match com o nome
    }

    // Salva um produto (somente se o nome não existir)
    public void salvarProduto(Produto p) {
        if (p == null || existePeloNome(p.getNome())) return;
        p.setId(proximoId++);
        produtos.add(p);
    }

    // Remove um produto pelo objeto (compara ID)
    public void deletarProduto(Produto p) {
        if (p == null || p.getId() == null) return;
        produtos.removeIf(produto -> produto.getId().equals(p.getId())); // So remove if condição
    }

    // Retorna uma cópia da lista de produtos para evitar modificações externas
    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    // Remove produto diretamente pelo ID
    public void deletarProdutoPorId(Long id) {
        if (id == null) return;
        produtos.removeIf(produto -> id.equals(produto.getId()));
    }
}
