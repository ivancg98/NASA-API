package com.example.spqr.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Planeta {

	@Id
	private String id;
	private String nom;
	private int periodeRotacio;
	private int periodeOrbita;
	private int diametre;
	private String clima;

	public Planeta(String id, String nom, int periodeRotacio, int periodeOrbita, int diametre, String clima) {
		super();
		this.id = id;
		this.nom = nom;
		this.periodeRotacio = periodeRotacio;
		this.periodeOrbita = periodeOrbita;
		this.diametre = diametre;
		this.clima = clima;
	}

	public Planeta() {

	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getPeriodeRotacio() {
		return periodeRotacio;
	}

	public int getPeriodeOrbita() {
		return periodeOrbita;
	}

	public int getDiametre() {
		return diametre;
	}

	public String getClima() {
		return clima;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPeriodeRotacio(int periodeRotacio) {
		this.periodeRotacio = periodeRotacio;
	}

	public void setPeriodeOrbita(int periodeOrbita) {
		this.periodeOrbita = periodeOrbita;
	}

	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}
}