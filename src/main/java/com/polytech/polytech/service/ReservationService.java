package com.polytech.polytech.service;

import com.polytech.polytech.entity.Reservation;
import com.polytech.polytech.repository.ReservationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ReservationService
{
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation)
    {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Reservation reservation)
    {
        reservationRepository.delete(reservation);
    }

    public Optional<Reservation> FindReservation(Long id)
    {
        return reservationRepository.findById(id);
    }

    public List<Reservation> FindAllReservation()
    {
        return reservationRepository.findAll();
    }

    public void UpdateReservation(Long id, Reservation reservation)
    {
        if(id.equals(reservation.getId()))
        {
            Optional<Reservation> oldReservation = reservationRepository.findById(id);
            reservationRepository.delete(oldReservation.orElseThrow((() -> new Error("Objet introuvable !"))));
            reservationRepository.save(reservation);
        }
    }
}
