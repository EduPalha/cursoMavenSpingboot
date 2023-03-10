package com.farmcont.services;

import com.farmcont.domain.Categoria;
import com.farmcont.repositories.CategoriaRepository;
import com.farmcont.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.lang.String.*;

@Service
public class CategoriaService {
    @Autowired//usando esse recurso a dependência vai ser automaticamente instanciada pelo spring boot
    private CategoriaRepository repo;



    public Categoria find(Integer id) {
        Optional<Categoria> objeto = repo.findById(id);
        return objeto.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
    public List<Categoria> findAll() {
        return repo.findAll();
    }
    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
        PageRequest pageRequest = PageRequest.of(page,linesPerPage, Sort.Direction.valueOf(direction),orderBy);
        return repo.findAll(pageRequest);
    }

}
