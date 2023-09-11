package com.placeTiEstagio.desafio.requests;

import lombok.Data;

import java.time.Year;

@Data
public class ModeloPostRequestBody {
    private String nome;
    private Year ano;
    private boolean ativo;
    private String marca;
}
