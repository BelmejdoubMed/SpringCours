package com.example.Gestion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Gestion.entity.Etudiant;
import com.example.Gestion.repository.EtudiantRepository;


@Service
public class EtudiantService {

	@Autowired
	private EtudiantRepository etudiantRepository;

	public List<Etudiant> getAllEtudiants(){
		List<Etudiant> etudiants=  etudiantRepository.findAll();

		return etudiants.size()>0 ? etudiants : null;
	}

	public Optional<Etudiant> getEtudiantById(String code){
		return etudiantRepository.findById(code);
	}
  
	public Etudiant createEtudiant(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	public String deleteEtudiant(String code) {
		etudiantRepository.deleteById(code);

		return "Well deleted";
	}

	public String updateEtudiant(Etudiant etudiant) {
		String message = null;
		Optional<Etudiant> e = etudiantRepository.findById(etudiant.getCode());

		if( e == null ) {
			message = "Could not update a student that doesn't exist";
		} else {
			etudiantRepository.save(etudiant);
			message = "Updated !";
		}
		return message;
	}
}
