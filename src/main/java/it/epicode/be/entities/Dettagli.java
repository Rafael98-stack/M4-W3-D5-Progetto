package it.epicode.be.entities;

import javax.persistence.*;

@Entity
@Table(name = "dettagli")
@DiscriminatorColumn(name="dettagli")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name="findByCodiceISBN", query = "SELECT a FROM Dettagli a WHERE a.codiceISBN = :codiceISBN ")
@NamedQuery(name="findByTitolo", query = "SELECT a FROM Dettagli a WHERE a.Titolo = :Titolo ")
@NamedQuery(name = "findByPartialTitolo", query = "SELECT a FROM Dettagli a WHERE LOWER(a.Titolo) LIKE LOWER(CONCAT(:partialTitolo, '%'))")
@NamedQuery(name="findByAnnoPubblicazione", query = "SELECT a FROM Dettagli a WHERE a.annoPubblicazione = :annoPubblicazione ")
@NamedQuery(name="findByAutore", query = "SELECT a FROM Libri a WHERE a.autore = :autore ")
public abstract class Dettagli {
    @Id
    @GeneratedValue
    protected long id;
    private long codiceISBN;
    private String Titolo;
    private int annoPubblicazione;
    private int pagine;

    public Dettagli() {
    }

    public Dettagli(long codiceISBN, String titolo, int annoPubblicazione, int pagine) {
        this.codiceISBN = codiceISBN;
        Titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.pagine = pagine;
    }

    public Long getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(Long codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Dettagli{" +
                "id=" + id +
                ", codiceISBN=" + codiceISBN +
                ", Titolo='" + Titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
