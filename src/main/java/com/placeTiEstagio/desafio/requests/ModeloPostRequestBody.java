package com.placeTiEstagio.desafio.requests;

import lombok.Data;

@Data
public class ModeloPostRequestBody {
    private String nome;
    private Long codigoDenatran;
    private boolean ativo;
}
