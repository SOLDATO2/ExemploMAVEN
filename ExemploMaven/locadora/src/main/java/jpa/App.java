package jpa;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import modelos.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p = new Pessoa("Arlos", "123");

        //Configuração da persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo_MySQL");
        EntityManager em = emf.createEntityManager();

        //Gravação banco de dados
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        //Fechamento recursos

   
        em.close();
        emf.close();
    }
}
