package com.polytech.polytech.dto;

import com.polytech.polytech.entity.Utilisateur;
import com.polytech.polytech.entity.Velo;
import java.time.LocalDateTime;

public record ReservationDTO (
        Long id,
        Integer reservation,
        LocalDateTime date_debut,
        LocalDateTime date_fin,
        Utilisateur utilisateur,
        Velo velo
){}

