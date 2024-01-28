//package it.epicode.be.entities;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//public class Prestito {
//    @Id
//    @GeneratedValue
//    @ManyToOne
//    private Utente utente;
//    @ManyToOne
//    @JoinColumn(name="dettagli_id")
//    private Dettagli dettagli;
//    private Date dataInizioPrestito;
//    private Date dataRestituzionePrevista;
//    private Date restituzioneEffettiva;
//
//    public Prestito() {
//    }
//
//    public Prestito(Utente utente, Dettagli dettagli, Date dataInizioPrestito, Date dataRestituzionePrevista, Date restituzioneEffettiva) {
//        this.utente = utente;
//        this.dettagli = dettagli;
//        this.dataInizioPrestito = dataInizioPrestito;
//        this.dataRestituzionePrevista = dataRestituzionePrevista;
//        this.restituzioneEffettiva = restituzioneEffettiva;
//    }
//
//    public Utente getUtente() {
//        return utente;
//    }
//
//    public void setUtente(Utente utente) {
//        this.utente = utente;
//    }
//
//    public Dettagli getDettagli() {
//        return dettagli;
//    }
//
//    public void setDettagli(Dettagli dettagli) {
//        this.dettagli = dettagli;
//    }
//
//    public Date getDataInizioPrestito() {
//        return dataInizioPrestito;
//    }
//
//    public void setDataInizioPrestito(Date dataInizioPrestito) {
//        this.dataInizioPrestito = dataInizioPrestito;
//    }
//
//    public Date getDataRestituzionePrevista() {
//        return dataRestituzionePrevista;
//    }
//
//    public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
//        this.dataRestituzionePrevista = dataRestituzionePrevista;
//    }
//
//    public Date getRestituzioneEffettiva() {
//        return restituzioneEffettiva;
//    }
//
//    public void setRestituzioneEffettiva(Date restituzioneEffettiva) {
//        this.restituzioneEffettiva = restituzioneEffettiva;
//    }
//
//    @Override
//    public String toString() {
//        return "Prestito{" +
//                "utente=" + utente +
//                ", dettagli=" + dettagli +
//                ", dataInizioPrestito=" + dataInizioPrestito +
//                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
//                ", restituzioneEffettiva=" + restituzioneEffettiva +
//                '}';
//    }
//}
