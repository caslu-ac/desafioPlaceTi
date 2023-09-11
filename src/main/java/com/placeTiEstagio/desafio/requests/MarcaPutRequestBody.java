package com.placeTiEstagio.desafio.requests;

import lombok.Data;

@Data
public class MarcaPutRequestBody {
    private Long id;
    private String name;
    private Long codigoDenatran;
    private boolean ativo;
}
