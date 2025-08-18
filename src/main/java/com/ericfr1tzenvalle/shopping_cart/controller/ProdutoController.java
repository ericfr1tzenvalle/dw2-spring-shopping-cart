/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ericfr1tzenvalle.shopping_cart.controller;

import com.ericfr1tzenvalle.shopping_cart.model.Produto;
import com.ericfr1tzenvalle.shopping_cart.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Luísa
 */

@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;
    
    
    @GetMapping("/produtos")
    public String listarProdutos(Model model){
        model.addAttribute("produtos", repository.getProdutos());
        return "listar_produtos";
        
    }
    
    
    @GetMapping("/produtos/novo")
    public String novoProdutoForm(Model model){
       model.addAttribute("produto", new Produto());
       return "form-produto";
    }
    @PostMapping("/produtos")
    public String salvarProduto(@Valid @ModelAttribute("produto") Produto produto, BindingResult result, Model model){
        if(result.hasErrors()){
            return "form-produto";
        }
        repository.salvarProduto(produto);
        return "redirect:/produtos";
    }
    
    
    
    
}

