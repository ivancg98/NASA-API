package com.example.spqr.repository;

import com.example.spqr.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, String>{

}
