package com.polytech.polytech.service;

import com.polytech.polytech.entity.Utilisateur;
import com.polytech.polytech.repository.UtilisateurRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UtilisateurService
{
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur addUtilisateur(Utilisateur utilisateur)
    {
        return utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateur(Utilisateur utilisateur)
    {
        utilisateurRepository.delete(utilisateur);
    }

    public Optional<Utilisateur> FindUtilisateur(Long id)
    {
        return utilisateurRepository.findById(id);
    }

    public List<Utilisateur> FindAllUtilisateur()
    {
        return utilisateurRepository.findAll();
    }

    public void UpdateUtilisateur(Long id, Utilisateur utilisateur)
    {
        if(id.equals(utilisateur.getId()))
        {
            Optional<Utilisateur> oldUtilisateur = utilisateurRepository.findById(id);
            utilisateurRepository.delete(oldUtilisateur.orElseThrow((() -> new Error("Objet introuvable !"))));
            utilisateurRepository.save(utilisateur);
        }
    }
}
