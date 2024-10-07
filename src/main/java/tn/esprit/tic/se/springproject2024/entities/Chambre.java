package tn.esprit.tic.se.springproject2024.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "chambre")  // nom du table
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chambre")
    private Long idChambre;

    @Column(name = "numero_chambre")
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_chambre")//enumerated bch ymchili mi 0
    private TypeChambre typeC;

    // Constructeur par défaut
    public Chambre() {}

    // Constructeur paramétré
    public Chambre(Long numeroChambre, TypeChambre typeC) {
        this.numeroChambre = numeroChambre;
        this.typeC = typeC;
    }

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
    @ManyToOne
    Bloc  bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}


