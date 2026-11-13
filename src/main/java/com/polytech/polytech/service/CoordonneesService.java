package com.polytech.polytech.service;

import com.polytech.polytech.entity.Coordonnees;
import com.polytech.polytech.repository.CoordonneesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CoordonneesService
{
    @Autowired
    private CoordonneesRepository coordonneesRepository;

    public Coordonnees addCoordonnees(Coordonnees coordonnees)
    {
        return coordonneesRepository.save(coordonnees);
    }

    public void deleteCoordonnees(Coordonnees coordonnees)
    {
        coordonneesRepository.delete(coordonnees);
    }

    public Optional<Coordonnees> FindCoordonnees(Long id)
    {
        return coordonneesRepository.findById(id);
    }

    public List<Coordonnees> FindAllCoordonnees()
    {
        return coordonneesRepository.findAll();
    }

    public void UpdateCoordonnees(Long id, Coordonnees coordonnees)
    {
        if(id.equals(coordonnees.getId()))
        {
            Optional<Coordonnees> oldCoordonnees = coordonneesRepository.findById(id);
            coordonneesRepository.delete(oldCoordonnees.orElseThrow((() -> new Error("Objet introuvable !"))));
            coordonneesRepository.save(coordonnees);
        }
    }
}
