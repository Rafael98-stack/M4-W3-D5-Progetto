//package it.epicode.be.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import java.util.Date;
//import java.util.Set;
//
//@Entity
//public class Utente {
//    @Id
//    @GeneratedValue
//    private String nome;
//    private String cognome;
//    private Date dataNascita;
//    private Long numeroTessera;
//@OneToMany(mappedBy = "utente")
//private Set<Prestito> prestito;
//    public Utente() {
//    }
//
//    public Utente(String nome, String cognome, Date dataNascita, Long numeroTessera, Set<Prestito> prestito) {
//        this.nome = nome;
//        this.cognome = cognome;
//        this.dataNascita = dataNascita;
//        this.numeroTessera = numeroTessera;
//        this.prestito = prestito;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCognome() {
//        return cognome;
//    }
//
//    public void setCognome(String cognome) {
//        this.cognome = cognome;
//    }
//
//    public Date getDataNascita() {
//        return dataNascita;
//    }
//
//    public void setDataNascita(Date dataNascita) {
//        this.dataNascita = dataNascita;
//    }
//
//    public Long getNumeroTessera() {
//        return numeroTessera;
//    }
//
//    public void setNumeroTessera(Long numeroTessera) {
//        this.numeroTessera = numeroTessera;
//    }
//
//    public Set<Prestito> getPrestito() {
//        return prestito;
//    }
//
//    public void setPrestito(Set<Prestito> prestito) {
//        this.prestito = prestito;
//    }
//
//    @Override
//    public String toString() {
//        return "Utente{" +
//                "nome='" + nome + '\'' +
//                ", cognome='" + cognome + '\'' +
//                ", dataNascita=" + dataNascita +
//                ", numeroTessera=" + numeroTessera +
//                ", prestito=" + prestito +
//                '}';
//    }
//}
