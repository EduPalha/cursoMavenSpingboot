package org.farmcont;

import org.farmcont.dominio.Pessoa;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exaulamaven");
        EntityManager em = emf.createEntityManager();

        Pessoa p;
        //p = new Pessoa(null, "Alexandre", "alexz@ufn.edu.br");
        //p = new Pessoa(null, "João", "joao@ufn.edu.br");
        //p = new Pessoa(null, "Ricardo", "rick@ufn.edu.br");
        //p = new Pessoa(null, "Ana", "ana@ufn.edu.br");

        try{
            em.getTransaction().begin();
//            em.persist(p); //INSERE
//            p = em.find(Pessoa.class, 9); //LOCALIZA
//            System.out.println("Pessoa localizada: " + p);
//            em.remove(p); //precisa do de cima para EXCLUI
            em.getTransaction().commit();
            System.out.println("Realizado com sucesso!");
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e);
            em.getTransaction().rollback();
        }

        em.close();
        emf.close();

    }
}
