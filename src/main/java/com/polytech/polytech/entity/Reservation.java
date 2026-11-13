package com.polytech.polytech.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/** represente la table reservation dans la BDD**/

@Entity
@Table(name = "reservation")
public class Reservation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer reservation;
    private LocalDateTime date_debut;
    private LocalDateTime date_fin;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "velo_id")
    private Velo velo;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Integer getReservation() { return reservation; }

    public void setReservation(Integer reservation) { this.reservation = reservation; }

    public LocalDateTime getDate_debut() { return date_debut; }

    public void setDate_debut(LocalDateTime date_debut) { this.date_debut = date_debut; }

    public LocalDateTime getDate_fin() { return date_fin; }

    public void setDate_fin(LocalDateTime date_fin) { this.date_fin = date_fin; }
}
