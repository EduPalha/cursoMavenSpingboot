package com.farmcont;

import com.farmcont.domain.Categoria;
import com.farmcont.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AulaSpringBootTesteApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository cr;

    public static void main(String[] args) {
        SpringApplication.run(AulaSpringBootTesteApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria("consultório");
        Categoria cat2 = new Categoria("casa");

        cr.save(cat1);
        cr.save(cat2);
    }
}
