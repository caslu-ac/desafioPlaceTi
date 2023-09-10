package com.placeTiEstagio.desafio.repositorio;

import com.placeTiEstagio.desafio.Modelo.Marca;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long> {
    public default List<Marca> listAll() {

        return null;
    }
}


