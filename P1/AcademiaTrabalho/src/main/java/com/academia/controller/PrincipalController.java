package com.academia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController 
{
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("Inicio");
		return mv;
	}
	@GetMapping("/contato")
	public ModelAndView loc()
	{
		ModelAndView mv = new ModelAndView("Contato");
		return mv;
	}
}
