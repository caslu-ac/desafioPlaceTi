package com.placeTiEstagio.desafio.repository;

import com.placeTiEstagio.desafio.domain.Marca;
import com.placeTiEstagio.desafio.domain.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepositorio extends JpaRepository<Modelo, Long> {

}


