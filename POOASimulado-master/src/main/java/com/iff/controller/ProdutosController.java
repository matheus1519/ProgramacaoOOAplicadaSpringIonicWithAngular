package com.iff.controller;

import com.iff.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/produtos")
public class ProdutosController 
{
    @Autowired
    Produtos produtosRepo;
    
    @GetMapping
    public ModelAndView listar()
    {
        ModelAndView mv = new ModelAndView("ListagemProdutos");
        mv.addObject("produtos", produtosRepo.findAll());
        return mv;
    }
}
