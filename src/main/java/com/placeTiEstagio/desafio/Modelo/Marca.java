package com.placeTiEstagio.desafio.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Marca {
    @Id
    private Long id;
    private String nome;
    private Long codigoDenatran;
    private boolean ativo;
}
