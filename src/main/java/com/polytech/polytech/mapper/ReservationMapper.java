package com.polytech.polytech.mapper;

import com.polytech.polytech.dto.ReservationDTO;
import com.polytech.polytech.entity.Reservation;

public class ReservationMapper
{
    public static ReservationDTO toDTO(Reservation reservation)
    {
        return new ReservationDTO(reservation.getId(),reservation.getReservation(), reservation.getDate_debut(),reservation.getDate_fin(),reservation.getUtilisateur(), reservation.getVelo());
    }

    public static Reservation toEntity(ReservationDTO reservationDTO)
    {
        return new Reservation(reservationDTO.id(), reservationDTO.reservation(), reservationDTO.date_debut(), reservationDTO.date_fin(),reservationDTO.utilisateur(),reservationDTO.velo());
    }
}