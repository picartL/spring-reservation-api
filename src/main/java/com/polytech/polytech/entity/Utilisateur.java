package com.polytech.polytech.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/** represente la table utilisateur dans la BDD**/

@Entity
@Table(name = "utilisateur")
public class Utilisateur
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String mail;
    private String password;
    private String username;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Reservation> reservations = new HashSet<>();

    public Utilisateur(Long id, String nom, String prenom, String mail, String password, String username, Set<Reservation> reservations)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.password = password;
        this.username = username;
        this.reservations = reservations;
    }

    public Utilisateur(Long id, String username, String mail, String password)
    {
        this.id = id;
        this.nom = null;
        this.prenom = null;
        this.mail = mail;
        this.password = password;
        this.username = username;
        this.reservations = null;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
