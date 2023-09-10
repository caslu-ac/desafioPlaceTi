package com.placeTiEstagio.desafio.service;

import com.placeTiEstagio.desafio.Modelo.Marca;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service

public class MarcaService {
        private static List<Marca> marcas;
             static{
                marcas = new ArrayList<>(List.of(new Marca(1L, "volvo", 2L, true)));
        }

        public static List<Marca> listAll() {
        return marcas;
        }

    public static Marca save(Marca marca) {
                 marca.setId(ThreadLocalRandom.current().nextLong(3,9999999));
                 marcas.add(marca);
                 return marca;
    }
}

