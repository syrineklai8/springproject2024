package tn.esprit.tic.se.springproject2024.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "bloc")  // pour spécifier le nom de la table
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bloc")
    private Long idBloc;

    @Column(name = "nom_bloc")
    private String nomBloc;

    @Column(name = "capacite_bloc")
    private Long capaciteBloc;

    // Constructeur par défaut
    public Bloc() {}

    // Constructeur paramétré
    public Bloc(String nomBloc, Long capaciteBloc) {
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }
    @ManyToOne
    Foyer  foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;

}
