package com.placeTiEstagio.desafio.requests;

import com.placeTiEstagio.desafio.domain.Marca;
import lombok.Data;

import java.time.Year;

@Data
public class ModeloPutRequestBody {
    private Long id;
    private String nome;
    private Year ano;
    private boolean ativo;
    private Long id_marca;;
}
