/*
 */
package com.algaworks.controllers;

import com.algaworks.models.Convidado;
import com.algaworks.repository.Convidados;
import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/convidados")
public class ConvidadosControllerApi {

    @Autowired
    private Convidados convidados;

    @GetMapping
    public Collection<Convidado> listar() {
        return this.convidados.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Convidado> listarUm(@PathVariable Long id) {
        return this.convidados.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        Optional<Convidado> c = convidados.findById(id);
        if (c == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        convidados.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody Convidado convidado) 
    {
        return new ResponseEntity<Convidado>(convidados.save(convidado), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Convidado convidado) {
        return new ResponseEntity<Convidado>(convidados.save(convidado), HttpStatus.OK);
    }

}
