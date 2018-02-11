package fr.sh.TestHibernate03.modele;

import java.io.Serializable;

public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int id;
	protected String nom;
	protected String libelle;
	protected Categorie categorie;
	
	public Produit()
	{
		
	}
	
	
	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
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
		return "Produit [id=" + id + ", nom=" + nom + ", libelle=" + libelle + ", categorie=" + categorie + "]";
	}
	
	
	
}
