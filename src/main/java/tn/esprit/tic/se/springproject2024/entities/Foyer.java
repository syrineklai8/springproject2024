package tn.esprit.tic.se.springproject2024.entities;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.util.List ;
import java.util.Date ;
import java.util.Set;

@Entity
@Table ( name="Foyer")
public class Foyer implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer ;
    @Column(name="nomFoyer")
    private String nomFoyer ;
    @Column(name="capaciteFoyer")
    private Long capaciteFoyer ;
    //const par defaut
    public Foyer() {}

    // Const paramètré
    public Foyer(String nomFoyer, Long capaciteFoyer) {
        this.nomFoyer = nomFoyer;
        this.capaciteFoyer = capaciteFoyer;
    }

    // Getters et Setters
    public Long getIdFoyer() {
        return idFoyer;
    }

    public void setIdFoyer(Long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public String getNomFoyer() {
        return nomFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public Long getCapaciteFoyer() {
        return capaciteFoyer;
    }

    public void setCapaciteFoyer(Long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }
    @OneToOne
    private Universite universite ;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocs;
}


