package com.washington.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.washington.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

}
