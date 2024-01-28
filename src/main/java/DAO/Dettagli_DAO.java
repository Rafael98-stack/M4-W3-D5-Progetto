package DAO;

import it.epicode.be.entities.Dettagli;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class Dettagli_DAO {
    private EntityManager em;

    public Dettagli_DAO(EntityManager em) {
        this.em = em;
    }



    public void save (Dettagli dettaglio){
        try{
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.merge(dettaglio);
            transaction.commit();
            System.out.println( dettaglio + "salvato correttamente");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void findByIdAndDelete(long id) {
        Dettagli found = em.find(Dettagli.class, id);

        if (found != null) {

            EntityTransaction transaction = em.getTransaction();

            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Il Dettaglio è stato cancellato correttamente");
        } else {
            System.err.println("Il Dettaglio con l'id " + id + " non è stato trovato");
        }
    }
    public List<Dettagli> findByCodiceISBN(long codiceISBN) {
        try {
            TypedQuery<Dettagli> getAnimalsByName = em.createNamedQuery("findByCodiceISBN", Dettagli.class);
            getAnimalsByName.setParameter("codiceISBN", codiceISBN);
           return getAnimalsByName.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void findByTitolo(String titolo) {
        try {
            TypedQuery<Dettagli> getAnimalsByName = em.createNamedQuery("findByTitolo", Dettagli.class);
            getAnimalsByName.setParameter("Titolo", titolo);
            getAnimalsByName.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void findByPartialTitolo(String partialTitolo) {
        // Alternativamente alla TypedQuery potrei utilizzare Query ma così non avrei certezza sui tipi
        TypedQuery<Dettagli> getAnimalsByName = em.createNamedQuery("findByPartialTitolo", Dettagli.class);
        getAnimalsByName.setParameter("partialTitolo", partialTitolo);
        getAnimalsByName.getResultList();
    }
    public void findByAnnoPubblicazione(int annoPubblicazione) {
        try {
            TypedQuery<Dettagli> getAnimalsByName = em.createNamedQuery("findByAnnoPubblicazione", Dettagli.class);
            getAnimalsByName.setParameter("annoPubblicazione", annoPubblicazione);
            getAnimalsByName.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void findByAutore(String autore) {
        try {
            TypedQuery<Dettagli> getAnimalsByName = em.createNamedQuery("findByAutore", Dettagli.class);
            getAnimalsByName.setParameter("autore", autore);
            getAnimalsByName.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
