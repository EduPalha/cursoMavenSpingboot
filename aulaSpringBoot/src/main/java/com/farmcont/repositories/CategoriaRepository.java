package com.farmcont.repositories;

import com.farmcont.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {

//    public List<Categoria> findByOrderByNome();
//
//    @Query(value = "select p.nome, p.preco, c.nome \n" +
//            "from produto p\n" +
//            "inner join produto_categoria as pc on pc.fk_id_produto = p.id\n" +
//            "inner join categoria as c on c.id = pc.fk_id_categoria", nativeQuery = true)
//    public List<Categoria> findByNativeQuery(String param);

}
