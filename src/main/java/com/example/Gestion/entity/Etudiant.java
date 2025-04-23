package com.example.Gestion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Etudiant {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String code;
	private String name;
	private String email;
	private String formation;
	
	public Etudiant(String code, String name, String email, String formation) {
		super();
		this.code 		= code;
		this.name 		= name;
		this.email 		= email;
		this.formation 	= formation;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", name=" + name + ", email=" + email + ", formation=" + formation + "]";
	}
	
}
