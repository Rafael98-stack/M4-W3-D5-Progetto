package DAO;

import it.epicode.be.entities.Libri;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Libri_DAO {
    private EntityManager em;

    public Libri_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Libri libri) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(libri);
            t.commit();
            System.out.println("Libro - " + libri.getTitolo() + " - creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
