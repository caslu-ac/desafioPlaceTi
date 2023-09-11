package com.placeTiEstagio.desafio.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MarcaPostRequestBody {
    private String nome;
    private Long codigoDenatran;
    private boolean ativo;
}
