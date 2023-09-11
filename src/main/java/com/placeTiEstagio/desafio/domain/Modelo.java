package com.placeTiEstagio.desafio.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.Year;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@ToString
@Getter
@Setter
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Year ano;

    @ManyToOne
    @JoinColumn(name = "id_marca", referencedColumnName = "id")
    @JsonIgnoreProperties("modelos")
    private Marca marca;

    private boolean ativo;
}
