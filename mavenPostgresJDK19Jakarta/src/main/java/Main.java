import dominio.Pessoa;

import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Alexandre", "alexz@ufn.edu.br");
        //Pessoa p2 = new Pessoa(null, "João", "joao@ufn.edu.br");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exaulamaven");
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();

            System.out.println(p1);
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e);
            em.getTransaction().rollback();
        }

    }
}
