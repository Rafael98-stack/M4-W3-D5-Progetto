package it.epicode.be.entities;

import javax.persistence.*;

@Entity
@Table(name = "libbri")
public class Libri extends Dettagli{
    @Id
    @GeneratedValue
    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libri() {
    }

    public Libri(Long codiceISBN, String titolo, int annoPubblicazione, int pagine, String autore, Genere genere) {
        super(codiceISBN, titolo, annoPubblicazione, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
