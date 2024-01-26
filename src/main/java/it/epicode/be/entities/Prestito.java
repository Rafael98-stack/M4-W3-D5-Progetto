package it.epicode.be.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="prestito")
public class Prestito {
    @OneToOne
    private Utente utente;
    @OneToMany
    private Set<Libri> libri;
    @OneToMany
    private Set<Riviste> riviste;
    private Date dataInizioPrestito;
    private Date dataRestituzionePrevista;
    private Date restituzioneEffettica;

    public Prestito() {
    }

    public Prestito(Utente utente, Set<Libri> libri, Set<Riviste> riviste, Date dataInizioPrestito, Date dataRestituzionePrevista, Date restituzioneEffettica) {
        this.utente = utente;
        this.libri = libri;
        this.riviste = riviste;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.restituzioneEffettica = restituzioneEffettica;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Set<Libri> getLibri() {
        return libri;
    }

    public void setLibri(Set<Libri> libri) {
        this.libri = libri;
    }

    public Set<Riviste> getRiviste() {
        return riviste;
    }

    public void setRiviste(Set<Riviste> riviste) {
        this.riviste = riviste;
    }

    public Date getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(Date dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public Date getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public Date getRestituzioneEffettica() {
        return restituzioneEffettica;
    }

    public void setRestituzioneEffettica(Date restituzioneEffettica) {
        this.restituzioneEffettica = restituzioneEffettica;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", libri=" + libri +
                ", riviste=" + riviste +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", restituzioneEffettica=" + restituzioneEffettica +
                '}';
    }
}
