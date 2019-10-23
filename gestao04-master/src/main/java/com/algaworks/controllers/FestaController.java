package com.algaworks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FestaController 
{
	@GetMapping("/festa")
	public ModelAndView listar()
	{
		ModelAndView mv = new ModelAndView("Festa");
		return mv;
	}
}
