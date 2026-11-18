package com.polytech.polytech.dto;

import com.polytech.polytech.entity.Velo;

public record CoordonneesDTO(
        Long id,
        String latitude,
        String longitude,
        Velo velo
){}