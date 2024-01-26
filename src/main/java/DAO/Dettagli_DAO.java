package DAO;

import it.epicode.be.entities.Dettagli;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Dettagli_DAO {
    private EntityManager em;

    public Dettagli_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Dettagli dettagli) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(dettagli);
            t.commit();
            System.out.println("Dettaglio - " + dettagli.getTitolo() + " - Aggiunto!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
