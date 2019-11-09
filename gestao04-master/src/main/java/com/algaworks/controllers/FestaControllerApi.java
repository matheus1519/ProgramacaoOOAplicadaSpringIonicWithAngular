package com.algaworks.controllers;

import com.algaworks.models.Festa;
import com.algaworks.repository.Festas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/festas")
public class FestaControllerApi 
{
        @Autowired
        Festas festasTable;
        
		@GetMapping
		public List<Festa> listar()
		{
			return festasTable.findAll();
		}
        
        @PostMapping
        public void salvar(@RequestBody Festa f)
        {
            festasTable.save(f);
        }
        
        @DeleteMapping("/{id}")
        public void excluir(@PathVariable Long id)
        {
            festasTable.deleteById(id);
        }
        
        @PutMapping("/{id}")
        public void alterar(@PathVariable Long id, @RequestBody Festa f)
        {
        	festasTable.save(f);
        }
}
