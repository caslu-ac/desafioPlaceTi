package com.placeTiEstagio.desafio.service;

import com.placeTiEstagio.desafio.domain.Marca;
import com.placeTiEstagio.desafio.repository.MarcaRepositorio;
import com.placeTiEstagio.desafio.requests.MarcaPostRequestBody;
import com.placeTiEstagio.desafio.requests.MarcaPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MarcaService {

    private final MarcaRepositorio marcaRepositorio;

    public List<Marca> listAll() {
        return marcaRepositorio.findAll();
    }

    public Marca findByIdOrThrowBadRequestExeption(long id) {
        return marcaRepositorio.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "marca not found"));
    }

    public Marca save(MarcaPostRequestBody marcaPostRequestBody) {
        return marcaRepositorio.save(
                Marca.builder()
                        .nome(marcaPostRequestBody.getNome())
                        .codigoDenatran(marcaPostRequestBody.getCodigoDenatran())
                        .ativo(marcaPostRequestBody.isAtivo())
                        .build());
    }

    public void delete(long id) {
        marcaRepositorio.delete(findByIdOrThrowBadRequestExeption(id));
    }

    public void replace(MarcaPutRequestBody marcaPutRequestBody) {
        findByIdOrThrowBadRequestExeption(marcaPutRequestBody.getId());
        Marca marca = Marca.builder()
                .id(marcaPutRequestBody.getId())
                .nome(marcaPutRequestBody.getName())
                .codigoDenatran(marcaPutRequestBody.getCodigoDenatran())
                .ativo(marcaPutRequestBody.isAtivo())
                .build();
        marcaRepositorio.save(marca);
    }
}

