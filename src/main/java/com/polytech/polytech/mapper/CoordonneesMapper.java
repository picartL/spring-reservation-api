package com.polytech.polytech.mapper;

import com.polytech.polytech.dto.CoordonneesDTO;
import com.polytech.polytech.entity.Coordonnees;

public class CoordonneesMapper
{
    public static CoordonneesDTO toDTO(Coordonnees coordonnees)
    {
        return new CoordonneesDTO(coordonnees.getId(),coordonnees.getLatitude(),coordonnees.getLongitude(), coordonnees.getVelo());
    }

    public static Coordonnees toEntity(CoordonneesDTO coordonneesDTO)
    {
        return new Coordonnees(coordonneesDTO.id(),coordonneesDTO.latitude(),coordonneesDTO.longitude(), coordonneesDTO.velo());
    }
}
