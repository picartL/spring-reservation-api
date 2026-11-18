package com.polytech.polytech.mapper;

import com.polytech.polytech.dto.UtilisateurDTO;
import com.polytech.polytech.dto.UtilisateurLoguerDTO;
import com.polytech.polytech.entity.Utilisateur;

public class UtilisateurLoguerMapper
{
    public static UtilisateurLoguerDTO toDTO(Utilisateur utilisateur)
    {
        return new UtilisateurLoguerDTO(utilisateur.getId(),utilisateur.getUsername(), utilisateur.getMail(),utilisateur.getPassword());
    }

    public static Utilisateur toEntity(UtilisateurDTO utilisateurDTO)
    {
        return new Utilisateur(utilisateurDTO.id(), utilisateurDTO.username(),  utilisateurDTO.mail(), utilisateurDTO.password());
    }
}