package fr.sh.TestHibernate03.dto;

public class ProduitDto {
	protected String nom;
	protected String libelle;
	protected String categnom;
	
	
	public ProduitDto(String nom, String libelle, String categnom) {
		super();
		this.nom = nom;
		this.libelle = libelle;
		this.categnom = categnom;
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
	public String getCategnom() {
		return categnom;
	}
	public void setCategnom(String categnom) {
		this.categnom = categnom;
	}
	
	
}
