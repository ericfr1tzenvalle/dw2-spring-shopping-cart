package com.ericfr1tzenvalle.shopping_cart.controller;

import com.ericfr1tzenvalle.shopping_cart.model.Carrinho;
import com.ericfr1tzenvalle.shopping_cart.model.ItemCarrinho;
import com.ericfr1tzenvalle.shopping_cart.model.Produto;
import com.ericfr1tzenvalle.shopping_cart.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("carrinho")
@SessionAttributes("carrinho")
public class CarrinhoController {

    @Autowired
    ProdutoRepository repository;
    @ModelAttribute("carrinho")
    public Carrinho getCarrinho(){
        return new Carrinho();
    }

    @GetMapping("/exibir")
    public String exibirCarrinho(@ModelAttribute("carrinho") Carrinho carrinho, Model model){
        return "carrinho";
    }
    @PostMapping("/adicionar/{id}")
    public String adicionarItemAoCarrinho(@PathVariable Long id, @ModelAttribute("carrinho") Carrinho carrinho){
        Produto produto = repository.buscarPeloId(id);
        carrinho.addItem(new ItemCarrinho(produto));
        return "redirect:/produtos";
    }


}
