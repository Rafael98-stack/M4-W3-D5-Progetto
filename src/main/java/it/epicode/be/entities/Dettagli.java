package it.epicode.be.entities;

public abstract class Dettagli {
    private Long codiceISBN;
    private String Titolo;
    private int annoPubblicazione;
    private int pagine;

    public Dettagli() {
    }

    public Dettagli(Long codiceISBN, String titolo, int annoPubblicazione, int pagine) {
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
                "codiceISBN=" + codiceISBN +
                ", Titolo='" + Titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
