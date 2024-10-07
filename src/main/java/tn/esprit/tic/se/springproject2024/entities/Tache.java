package tn.esprit.tic.se.springproject2024.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tache")
public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tache")
    private Long idTache;

    @Column(name = "date_tache")
    private LocalDate dateTache;

    @Column(name = "duree")
    private Integer duree;

    @Column(name = "tarif_horaire")
    private Float tarifHoraire;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_tache")
    private TypeTache typeTache;

    // Constructeur par défaut
    public Tache() {}

    // Constructeur paramétré
    public Tache(LocalDate dateTache, Integer duree, Float tarifHoraire, TypeTache typeTache) {
        this.dateTache = dateTache;
        this.duree = duree;
        this.tarifHoraire = tarifHoraire;
        this.typeTache = typeTache;
    }

    // Getters et Setters
    public Long getIdTache() {
        return idTache;
    }

    public void setIdTache(Long idTache) {
        this.idTache = idTache;
    }

    public LocalDate getDateTache() {
        return dateTache;
    }

    public void setDateTache(LocalDate dateTache) {
        this.dateTache = dateTache;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public Float getTarifHoraire() {
        return tarifHoraire;
    }

    public void setTarifHoraire(Float tarifHoraire) {
        this.tarifHoraire = tarifHoraire;
    }

    public TypeTache getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(TypeTache typeTache) {
        this.typeTache = typeTache;
    }
    @ManyToOne
    Etudiant etudiant;
}
