//Controlador REST da captura de tela que explica o funcionamento do SpringBoot

package com.farmcont.resources;

import com.farmcont.domain.Categoria;
import com.farmcont.dto.CategoriaDTO;
import com.farmcont.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaService service;

    //TRAZ TODOS OS ITENS CADASTRADOS NA CLASSE|TABELA CATEGORIA SEM OS PRODUTOS RELACIONADOS.
    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<CategoriaDTO>> findAll(){
        List<Categoria> list = service.findAll();
        List<CategoriaDTO> listDTO = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    //TRAZ APENAS O ITEM DESCRITO CADASTRADO NA CLASSE|TABELA CATEGORIA
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Categoria obj = service.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }


//    @RequestMapping(value="/{page}", method= RequestMethod.GET)
//    public ResponseEntity<Page<CategoriaDTO>> findPage(
//            @RequestParam(value="page", defaultValue="0") Integer page,
//            @RequestParam(value="linesPerPage", defaultValue="25") Integer linesPerPage,
//            @RequestParam(value="orderBy", defaultValue="nome") String orderBy,
//            @RequestParam(value="direction", defaultValue="ASC") Integer direction) {
//
//        Page<Categoria> list = service.findPage(page, linesPerPage, orderBy, direction);
//        Page<CategoriaDTO> listDTO = list.map(obj -> new CategoriaDTO(obj));
//        return ResponseEntity.status(HttpStatus.OK).body(listDTO);
//    }




}
