package com.polytech.polytech.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/** represente la table coordonnees dans la BDD**/

@Entity
@Table(name = "coordonnees")
public class Coordonnees
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String latitude;
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "velo_id")
    private Velo velo;

    public Coordonnees(Long id, String latitude, String longitude, Velo velo)
    {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.velo = velo;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }

    public Velo getVelo() {
        return velo;
    }

    public void setVelo(Velo velo) {
        this.velo = velo;
    }
}
