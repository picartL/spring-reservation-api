package com.polytech.polytech.dto;

import com.polytech.polytech.entity.Reservation;
import java.util.Set;

public record UtilisateurDTO(
        Long id,
        String nom,
        String prenom,
        String mail,
        String password,
        String username,
        Set<Reservation> reservations
){}

