package com.farmcont;

import com.farmcont.domain.Categoria;
import com.farmcont.domain.Produto;
import com.farmcont.repositories.CategoriaRepository;
import com.farmcont.repositories.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AulaSpringBootTesteApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository cr;
    @Autowired
    private ProdutoRepository pr;

    public static void main(String[] args) {
        SpringApplication.run(AulaSpringBootTesteApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria("informática");
        Categoria cat2 = new Categoria("escritório");
        Categoria cat3 = new Categoria("consultório");
        Categoria cat4 = new Categoria("casa");

        Produto p1 = new Produto(1, "computador", 2000.00);
        Produto p2 = new Produto(2, "impressora", 500.00);
        Produto p3 = new Produto(3, "mouse", 40.00);

        cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
        cat2.getProdutos().addAll(Arrays.asList(p1,p2,p3));
        cat3.getProdutos().addAll(Arrays.asList(p1,p3));
        cat4.getProdutos().addAll(Arrays.asList(p1));

        p1.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3,cat4));
        p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1,cat2,cat3));

        cr.save(cat1);
        cr.save(cat2);
        cr.save(cat3);
        cr.save(cat4);

        pr.save(p1);
        pr.save(p2);
        pr.save(p3);
    }
}
