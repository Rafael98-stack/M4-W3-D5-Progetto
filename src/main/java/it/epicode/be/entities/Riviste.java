package it.epicode.be.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("riviste")
public class Riviste extends Dettagli{
//
//    @GeneratedValue
//    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Riviste() {
    }

    public Riviste(Long codiceISBN, String titolo, int annoPubblicazione, int pagine, Periodicita periodicita) {
        super(codiceISBN, titolo, annoPubblicazione, pagine);
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                '}';
    }
}
