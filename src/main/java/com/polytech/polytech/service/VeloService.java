package com.polytech.polytech.service;

import com.polytech.polytech.entity.Utilisateur;
import com.polytech.polytech.entity.Velo;
import com.polytech.polytech.repository.VeloRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VeloService
{
    @Autowired
    private VeloRepository veloRepository;

    public Velo addVelo(Velo velo)
    {
        return veloRepository.save(velo);
    }

    public void deleteVelo(Velo velo)
    {
        veloRepository.delete(velo);
    }

    public Optional<Velo> FindVelo(Long id)
    {
        return veloRepository.findById(id);
    }

    public List<Velo> FindAllVelo()
    {
        return veloRepository.findAll();
    }

    public void UpdateVelo(Long id, Velo velo)
    {
        if(id.equals(velo.getId()))
        {
            Optional<Velo> oldVelo = veloRepository.findById(id);
            veloRepository.delete(oldVelo.orElseThrow((() -> new Error("Objet introuvable !"))));
            veloRepository.save(velo);
        }
    }
}
