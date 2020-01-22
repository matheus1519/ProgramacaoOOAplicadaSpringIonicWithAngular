package com.academia.controller;

import com.academia.model.Treino;
import com.academia.repository.Exercicios;
import com.academia.repository.Treinos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/treinos")
public class TreinoController {
	
	@Autowired
	Treinos treinoTable;
        
        @Autowired
        Exercicios exercicioTable;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("Treino");
		mv.addObject("treinos",treinoTable.findAll());
		mv.addObject(new Treino());
                mv.addObject("exercicios",exercicioTable.findAll());
		return mv;		
	}
	
	@PostMapping
	public String salvar(Treino c)
	{
		this.treinoTable.save(c);
		return "redirect:/treinos";
	}
	
	@RequestMapping(path="/excluir/{id}")
	public String excluir(@PathVariable Long id)
	{
		this.treinoTable.deleteById(id);
		return "redirect:/treinos";
	}
	
	@RequestMapping(path="/alterar/{id}")
	public ModelAndView alterar(@PathVariable Long id)
	{
		ModelAndView mv = new ModelAndView("Treino");
		mv.addObject("treinos", treinoTable.findAll());
		mv.addObject("treino", treinoTable.findById(id));
                mv.addObject("exercicios",exercicioTable.findAll());
		return mv;
	}
	

}
