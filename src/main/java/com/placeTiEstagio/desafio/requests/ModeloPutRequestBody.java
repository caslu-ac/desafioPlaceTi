package com.placeTiEstagio.desafio.requests;

import com.placeTiEstagio.desafio.domain.Marca;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Data
@Getter
@Setter
public class ModeloPutRequestBody {
    private Long id;
    private String nome;
    private Year ano;
    private boolean ativo;
    private Long marca;
}
