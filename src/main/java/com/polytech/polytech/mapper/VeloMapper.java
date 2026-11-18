package com.polytech.polytech.mapper;

import com.polytech.polytech.dto.UtilisateurDTO;
import com.polytech.polytech.dto.VeloDTO;
import com.polytech.polytech.entity.Coordonnees;
import com.polytech.polytech.entity.Reservation;
import com.polytech.polytech.entity.Utilisateur;
import com.polytech.polytech.entity.Velo;
import jakarta.persistence.OneToMany;

public class VeloMapper
{
    public static VeloDTO toDTO(Velo velo)
    {
        return new VeloDTO(velo.getId(),velo.getNom(),velo.getQuantite(),velo.getDescription(),velo.getCoordonnees(),velo.getReservations());
    }

    public static Velo toEntity(VeloDTO veloDTO)
    {
        return new Velo(veloDTO.id(),veloDTO.nom(),veloDTO.quantite(),veloDTO.description(), veloDTO.coordonnees(), veloDTO.reservations());
    }
}