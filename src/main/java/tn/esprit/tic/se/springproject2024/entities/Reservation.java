package tn.esprit.tic.se.springproject2024.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @Column(name = "id_reservation", nullable = false)
    private String idReservation;

    @Column(name = "annee_universitaire")
    @Temporal(TemporalType.DATE)  // Indique que la colonne est de type Date (sans heure)
    private Date anneeUniversitaire;

    @Column(name = "est_valide")
    private boolean estValide;

    // Constructeur par défaut
    public Reservation() {}

    // Constructeur paramétré
    public Reservation(String idReservation, Date anneeUniversitaire, boolean estValide) {
        this.idReservation = idReservation;
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }

    // Getters et Setters
    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants ;
}

