package com.example.Gestion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gestion.entity.Etudiant;
import com.example.Gestion.service.EtudiantService;

@RestController
@RequestMapping("/Etudiants")
public class EtudiantController {

	@Autowired
	private EtudiantService etudiantService;
	
	@GetMapping
	public List<Etudiant> getAllEtudiant(){
		return etudiantService.getAllEtudiants();
	}
	
	@GetMapping("/{code}")
	public Optional<Etudiant> getEtudiantById(@PathVariable String code){
		return etudiantService.getEtudiantById(code);
	}
	
	@PostMapping
	public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.createEtudiant(etudiant);
	}
	
	@DeleteMapping("/delete/{code}")
	public String deleteEtudiant(@PathVariable String code ) {
		return etudiantService.deleteEtudiant(code);
	}
	
}
