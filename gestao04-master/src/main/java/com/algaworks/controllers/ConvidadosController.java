package com.algaworks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.models.Convidado;
import com.algaworks.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	Convidados convidadosTable;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListaConvidados.html");
		mv.addObject("convidados",convidadosTable.findAll());
		mv.addObject(new Convidado());
		return mv;		
	}
	
	@PostMapping
	public String salvar(Convidado c)
	{
		this.convidadosTable.save(c);
		return "redirect:/convidados";
	}
	
	@RequestMapping(path="/excluir/{id}")
	public String excluir(@PathVariable Long id)
	{
		this.convidadosTable.deleteById(id);
		return "redirect:/convidados";
	}
	
	@RequestMapping(path="/alterar/{id}")
	public ModelAndView alterar(@PathVariable Long id)
	{
		ModelAndView mv = new ModelAndView("ListaConvidados");
		mv.addObject("convidados", convidadosTable.findAll());
		mv.addObject("convidado", convidadosTable.findById(id));
		return mv;
	}
	

}
