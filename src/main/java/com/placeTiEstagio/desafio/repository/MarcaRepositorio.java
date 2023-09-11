package com.placeTiEstagio.desafio.repository;

import com.placeTiEstagio.desafio.domain.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long> {

}


