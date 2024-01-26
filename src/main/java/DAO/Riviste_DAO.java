package DAO;

import it.epicode.be.entities.Riviste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Riviste_DAO {
    private EntityManager em;

    public Riviste_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Riviste riviste) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(riviste);
            t.commit();
            System.out.println("Rivista - " + riviste.getTitolo() + " - creata!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
