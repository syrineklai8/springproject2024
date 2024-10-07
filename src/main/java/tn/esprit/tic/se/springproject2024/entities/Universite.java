package tn.esprit.tic.se.springproject2024.entities;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_universite")
    private Long idUniversite;

    @Column(name = "nom_universite")
    private String nomUniversite;

    @Column(name = "adresse")
    private String adresse;

    // Constructeur par défaut
    public Universite() {}

    // Constructeur paramétré
    public Universite(String nomUniversite, String adresse) {
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
