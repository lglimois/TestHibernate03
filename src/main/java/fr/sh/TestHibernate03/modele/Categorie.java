package fr.sh.TestHibernate03.modele;

import java.io.Serializable;

public class Categorie implements Serializable {
	protected int id;
	protected String nom;
	protected String libelle;
	
	public Categorie()
	{
		
	}
	
	public Categorie(int id, String nom, String libelle) {
		super();
		this.id = id;
		this.nom = nom;
		this.libelle = libelle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", libelle=" + libelle + "]";
	}
	
	
	
}
