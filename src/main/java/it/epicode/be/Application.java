package it.epicode.be;

import DAO.Dettagli_DAO;
import it.epicode.be.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
import java.util.function.Supplier;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Progetto_M4_W3_D5");
    public static void main(String[] args)
    {
        EntityManager em = emf.createEntityManager();
        Dettagli_DAO dd = new Dettagli_DAO(em);
//        Libri_DAO ld = new Libri_DAO(em);
//       Prestito_DAO pd = new Prestito_DAO(em);
//      Riviste_DAO rd = new Riviste_DAO(em);
//        Utente_DAO ud = new Utente_DAO(em);

//////////////////// SUPPLIER ////////////////////////////
        Supplier<Long> ICBNSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextLong(10000L, 20000L);
        };

        Supplier<Integer> AnnoSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1960, 2023);
        };

        Supplier<Integer> pagineSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextInt(100,500);
        };

        Supplier<Genere> randomGenereSupplier = () -> {
            Random random = new Random();
            int randomIndex = random.nextInt(Genere.values().length);
            return Genere.values()[randomIndex];
        };

        Supplier<Periodicita> randomPeriodicitaSupplier = () -> {
            Random random = new Random();
            int randomIndex = random.nextInt(Periodicita.values().length);
            return Periodicita.values()[randomIndex];
        };

        Supplier<Long> numeroTesseraSupplier = () -> {
            Random rndm = new Random();
            return rndm.nextLong(100000L, 200000L);
        };
/////////////////////////////////////////////////////////



        List<Dettagli> libri = new ArrayList<>();
//        libri.add(new Libri(ICBNSupplier.get(),"Verita'", AnnoSupplier.get(), pagineSupplier.get(),"Gianni",randomGenereSupplier.get()));
//        libri.add(new Libri(ICBNSupplier.get(),"Falsita''", AnnoSupplier.get(), pagineSupplier.get(),"Mirco",randomGenereSupplier.get()));

//        Set<Riviste> riviste = new HashSet<>();
//        riviste.add(new Riviste(ICBNSupplier.get(),"Nero'", AnnoSupplier.get(), pagineSupplier.get(),randomPeriodicitaSupplier.get()));
//        riviste.add(new Riviste(ICBNSupplier.get(),"Bianco", AnnoSupplier.get(), pagineSupplier.get(),randomPeriodicitaSupplier.get()));

        Libri libro1 = new Libri(ICBNSupplier.get(),"Verita", AnnoSupplier.get(), pagineSupplier.get(),"Gianni",randomGenereSupplier.get());
libri.add(libro1);
        Libri libro2 = new Libri(ICBNSupplier.get(),"Falsita", AnnoSupplier.get(), pagineSupplier.get(),"Mirco",randomGenereSupplier.get());
libri.add(libro2);
        Riviste rivista1 = new Riviste(ICBNSupplier.get(),"Nero", AnnoSupplier.get(), pagineSupplier.get(),randomPeriodicitaSupplier.get());


dd.findByCodiceISBN(13961);

dd.findByAnnoPubblicazione(2002);

dd.findByTitolo("Falsita");

//        dd.findByPartialTitolo("F").forEach(System.out::println);

dd.findByAutore("Gianni");

//dd.save(libro1);
//        dd.save(libro2);
//dd.save(rivista1);
//dd.findByIdAndDelete(2);

    }
}
