package com.academia.controller;

import com.academia.model.Exercicio;
import com.academia.model.Exercicio;
import com.academia.repository.Exercicios;
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
@RequestMapping("/exercicios")
public class ExercicioController {
        
        @Autowired
        Exercicios exercicioTable;
        
        @Autowired
        Treinos treinoTable;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("Exercicio");
		mv.addObject("exercicios",exercicioTable.findAll());
		mv.addObject(new Exercicio());
		return mv;		
	}
	
	@PostMapping
	public String salvar(Exercicio c)
	{
		this.exercicioTable.save(c);
		return "redirect:/exercicios";
	}
	
	@RequestMapping(path="/excluir/{id}")
	public String excluir(@PathVariable Long id)
	{
		this.exercicioTable.deleteById(id);
		return "redirect:/exercicios";
	}
	
	@RequestMapping(path="/alterar/{id}")
	public ModelAndView alterar(@PathVariable Long id)
	{
		ModelAndView mv = new ModelAndView("Exercicio");
		mv.addObject("exercicios", exercicioTable.findAll());
		mv.addObject("exercicio", exercicioTable.findById(id));
		return mv;
	}
	

}
