package com.polytech.polytech.repository;

import com.polytech.polytech.entity.Velo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VeloRepository extends JpaRepository<Velo,Long>
{

}
