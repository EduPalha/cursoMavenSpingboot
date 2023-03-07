package com.farmcont.services;

import com.farmcont.domain.Cliente;
import com.farmcont.repositories.ClienteRepository;
import com.farmcont.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;
    public Cliente buscar(Integer id) {
        Optional<Cliente> objeto = repo.findById(id);

        return objeto.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
