package com.polytech.polytech.mapper;

import com.polytech.polytech.dto.UtilisateurDTO;
import com.polytech.polytech.entity.Utilisateur;

public class UtilisateurMapper
{
    public static UtilisateurDTO toDTO(Utilisateur utilisateur)
    {
        return new UtilisateurDTO(utilisateur.getId(),utilisateur.getNom(), utilisateur.getPrenom(),utilisateur.getMail(),utilisateur.getPassword(),utilisateur.getUsername(),utilisateur.getReservations());
    }

    public static Utilisateur toEntity(UtilisateurDTO utilisateurDTO)
    {
        return new Utilisateur(utilisateurDTO.id(), utilisateurDTO.nom(), utilisateurDTO.prenom(), utilisateurDTO.mail(), utilisateurDTO.password(), utilisateurDTO.username(), utilisateurDTO.reservations());
    }
}
