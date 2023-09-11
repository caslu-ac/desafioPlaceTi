package com.placeTiEstagio.desafio.controller;

import com.placeTiEstagio.desafio.domain.Marca;
import com.placeTiEstagio.desafio.requests.MarcaPostRequestBody;
import com.placeTiEstagio.desafio.requests.MarcaPutRequestBody;
import com.placeTiEstagio.desafio.service.MarcaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("marcas")
@Log4j2
@RequiredArgsConstructor
public class MarcasController {

    private final MarcaService marcaService;

    @GetMapping
    public ResponseEntity<List<Marca>> list() {
        return ResponseEntity.ok(marcaService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Marca> findById(@PathVariable long id) {
        return ResponseEntity.ok(marcaService.findByIdOrThrowBadRequestExeption(id));
    }

    // listar

    @PostMapping
    public ResponseEntity<Marca> save(@RequestBody MarcaPostRequestBody marcaPostRequestBody) {
        return new ResponseEntity<>(marcaService.save(marcaPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        marcaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody MarcaPutRequestBody marcaPutRequestBody) {
        marcaService.replace(marcaPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}


//put


//delete
