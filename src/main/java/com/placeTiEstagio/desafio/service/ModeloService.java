package com.placeTiEstagio.desafio.service;

import com.placeTiEstagio.desafio.domain.Marca;
import com.placeTiEstagio.desafio.domain.Modelo;
import com.placeTiEstagio.desafio.repository.MarcaRepositorio;
import com.placeTiEstagio.desafio.repository.ModeloRepositorio;
import com.placeTiEstagio.desafio.requests.MarcaPostRequestBody;
import com.placeTiEstagio.desafio.requests.MarcaPutRequestBody;
import com.placeTiEstagio.desafio.requests.ModeloPostRequestBody;
import com.placeTiEstagio.desafio.requests.ModeloPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModeloService {

    private final ModeloRepositorio modeloRepositorio;
    private final MarcaRepositorio marcaRepositorio;


    public List<Modelo> listAll() {
        return modeloRepositorio.findAll();
    }

    public Modelo findByIdOrThrowBadRequestExeption(long id) {
        return modeloRepositorio.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "modelo not found"));
    }

    public Modelo save(ModeloPostRequestBody modeloPostRequestBody) {
        Marca marca = marcaRepositorio.findById(modeloPostRequestBody.getId_marca());
        return modeloRepositorio.save(
                Modelo.builder()
                        .nome(modeloPostRequestBody.getNome())
                        .ano(modeloPostRequestBody.getAno())
                        .ativo(modeloPostRequestBody.isAtivo())
                        .marca(marca)

                        .build());
    }

    public void delete(long id) {
        modeloRepositorio.delete(findByIdOrThrowBadRequestExeption(id));
    }

    public void replace(ModeloPutRequestBody modeloPutRequestBody) {
        findByIdOrThrowBadRequestExeption(modeloPutRequestBody.getId());
        Marca marca = marcaRepositorio.findById(modeloPutRequestBody.getMarcaId());
        Modelo modelo = Modelo.builder()
                .id(modeloPutRequestBody.getId())
                .nome(modeloPutRequestBody.getNome())
                .ano(modeloPutRequestBody.getAno())
                .ativo(modeloPutRequestBody.isAtivo())
                .marca(marca)

                .build();
        modeloRepositorio.save(modelo);
    }
}

