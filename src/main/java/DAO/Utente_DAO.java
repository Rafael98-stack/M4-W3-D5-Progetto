package DAO;

import it.epicode.be.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Utente_DAO {
    private EntityManager em;

    public Utente_DAO(EntityManager em) {
        this.em = em;
    }

    public void save(Utente utente) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(utente);
            t.commit();
            System.out.println("Utente - " + utente.getNome() + " " + utente.getCognome() + " - aggiunto!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
