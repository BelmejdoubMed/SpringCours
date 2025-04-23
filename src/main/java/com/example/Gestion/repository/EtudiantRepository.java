package com.example.Gestion.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Gestion.entity.Etudiant;


public interface EtudiantRepository extends JpaRepository<Etudiant,String> {
	
}