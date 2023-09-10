package com.placeTiEstagio.desafio.Controller;

import com.placeTiEstagio.desafio.Modelo.Marca;
import com.placeTiEstagio.desafio.repositorio.MarcaRepositorio;
import com.placeTiEstagio.desafio.service.MarcaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@Log4j2
@RequiredArgsConstructor
public class MarcasController {
    private  final MarcaRepositorio marcaRepositorio;
    private  final MarcaService marcaService;

    @GetMapping
    public ResponseEntity<List<Marca>> list(){
        return ResponseEntity.ok(MarcaService.listAll());
    }
    // listar

@PostMapping
    public ResponseEntity<Marca> save(@RequestBody Marca marca) {
   return new ResponseEntity<>(MarcaService.save(marca),HttpStatus.CREATED);

}
}


//put


//delete
