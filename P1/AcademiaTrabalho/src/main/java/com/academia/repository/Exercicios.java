/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academia.repository;

import com.academia.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 1519m
 */
public interface Exercicios extends JpaRepository<Exercicio, Long>{
    
}
