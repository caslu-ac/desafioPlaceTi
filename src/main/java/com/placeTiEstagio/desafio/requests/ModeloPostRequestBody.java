package com.placeTiEstagio.desafio.requests;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Data
@Getter
@Setter
public class ModeloPostRequestBody {
    private String nome;
    private Year ano;
    private boolean ativo;
    private Long idMarca;
}
