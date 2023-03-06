package com.farmcont.services;

import com.farmcont.domain.Categoria;
import com.farmcont.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired//usando esse recurso a dependência vai ser automaticamente instanciada pelo spring boot
    private CategoriaRepository repo;
    public Optional<Categoria> buscar(Integer id) {
        Optional<Categoria> objeto = repo.findById(id);
//        return objeto;
        return ResponseEntity.ok().body(objeto).getBody();
    }
}
