package com.algaworks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController 
{
	@GetMapping("")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
	@GetMapping("/localizacao")
	public ModelAndView loc()
	{
		ModelAndView mv = new ModelAndView("Localizacao");
		return mv;
	}
}
