package com.algaworks.controllers;

import com.algaworks.models.Festa;
import com.algaworks.repository.Festas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/festas")
public class FestaController 
{
        @Autowired
        Festas festasTable;
        
	@GetMapping
	public ModelAndView listar()
	{
		ModelAndView mv = new ModelAndView("Festa.html");
                mv.addObject("festas",festasTable.findAll());
                mv.addObject(new Festa());
		return mv;
	}
        
        @PostMapping
        public String salvar(Festa f)
        {
            festasTable.save(f);
            return "redirect:/festas";
        }
        
        @GetMapping("/excluir/{id}")
        public String excluir(@PathVariable Long id)
        {
            festasTable.deleteById(id);
            return "redirect:/festas";
        }
        
        @GetMapping("/alterar/{id}")
        public ModelAndView alterar(@PathVariable Long id)
        {
            ModelAndView mv = new ModelAndView("Festa");
            mv.addObject("festas",festasTable.findAll());
            mv.addObject("festa", festasTable.findById(id));
            return mv;
        }
}
