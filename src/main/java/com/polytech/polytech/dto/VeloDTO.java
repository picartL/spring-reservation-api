package com.polytech.polytech.dto;

import com.polytech.polytech.entity.Coordonnees;
import com.polytech.polytech.entity.Reservation;
import java.util.Set;

public record VeloDTO(
        Long id,
        String nom,
        int quantite,
        String description,
        Set<Coordonnees> coordonnees,
        Set<Reservation> reservations
){}
