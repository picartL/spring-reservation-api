package com.polytech.polytech.repository;

import com.polytech.polytech.entity.Coordonnees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordonneesRepository extends JpaRepository<Coordonnees,Long>
{

}
