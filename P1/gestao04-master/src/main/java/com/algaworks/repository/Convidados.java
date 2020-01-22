package com.algaworks.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.algaworks.models.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
