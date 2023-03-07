package com.farmcont.services;

import com.farmcont.domain.Categoria;
import com.farmcont.repositories.CategoriaRepository;

import com.farmcont.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired//usando esse recurso a dependência vai ser automaticamente instanciada pelo spring boot
    private CategoriaRepository repo;
    public Categoria buscar(Integer id) {
        Optional<Categoria> objeto = repo.findById(id);
//        if(objeto == null){
//            throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName());
//        }
//        return objeto;
        return objeto.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
