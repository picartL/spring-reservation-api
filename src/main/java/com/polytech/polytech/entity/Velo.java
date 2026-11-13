package com.polytech.polytech.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/** represente la table velo dans la BDD**/


@Entity
@Table(name = "velo")
public class Velo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int quantite;
    private String description;

    @OneToMany(mappedBy = "velo")
    private Set<Coordonnees> coordonnees = new HashSet<>();

    @OneToMany(mappedBy = "velo")
    private Set<Reservation> reservations = new HashSet<>();

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public int getQuantite() { return quantite; }

    public void setQuantite(int quantite) { this.quantite = quantite; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
