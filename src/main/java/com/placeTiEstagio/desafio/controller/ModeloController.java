package com.placeTiEstagio.desafio.controller;

import com.placeTiEstagio.desafio.domain.Marca;
import com.placeTiEstagio.desafio.domain.Modelo;
import com.placeTiEstagio.desafio.requests.MarcaPostRequestBody;
import com.placeTiEstagio.desafio.requests.MarcaPutRequestBody;
import com.placeTiEstagio.desafio.requests.ModeloPostRequestBody;
import com.placeTiEstagio.desafio.requests.ModeloPutRequestBody;
import com.placeTiEstagio.desafio.service.MarcaService;
import com.placeTiEstagio.desafio.service.ModeloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("modelo")
@Log4j2
@RequiredArgsConstructor
public class ModeloController {

    private final ModeloService modeloService;

    @GetMapping
    public ResponseEntity<List<Modelo>> list() {
        return ResponseEntity.ok(modeloService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Modelo> findById(@PathVariable long id) {
        return ResponseEntity.ok(modeloService.findByIdOrThrowBadRequestExeption(id));
    }

    // listar

    @PostMapping
    public ResponseEntity<Modelo> save(@RequestBody ModeloPostRequestBody modeloPostRequestBody) {
        return new ResponseEntity<>(modeloService.save(modeloPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        modeloService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody ModeloPutRequestBody modeloPutRequestBody) {
        modeloService.replace(modeloPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}


//put


//delete
