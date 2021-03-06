package fr.sh.TestHibernate03.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sh.TestHibernate03.dto.ProduitDto;
import fr.sh.TestHibernate03.modele.Categorie;
import fr.sh.TestHibernate03.modele.Produit;
import fr.sh.TestHibernate03.service.ServiceMetier;
import fr.sh.TestHibernate03.service.SimpleObject;

@RestController
public class ReadController {

	@RequestMapping("/")
    public SimpleObject index() {
        return new SimpleObject("armel", "leclecj");
		//return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/getcateg")
	public List<Categorie> getCategorie()
	{
		
		
		ServiceMetier sm = new ServiceMetier();
		List<Categorie> lst = sm.getLstCateg();
		return lst;
	}
	
	@RequestMapping("/getonecateg")
	public Categorie getOneCategorie()
	{
		
		ServiceMetier sm = new ServiceMetier();
		Categorie c = sm.getOneCateg(1);
		return c;
	}

	@RequestMapping("/getoneproduit")
	public Produit getOneProduit()
	{
		
		ServiceMetier sm = new ServiceMetier();
		Produit p = sm.getOneProduit(1);
		return p;
	}

	@RequestMapping("/getproduits")
	public List<ProduitDto> getProduits()
	{
		ServiceMetier sm = new ServiceMetier();
		List<ProduitDto> lst = sm.getLstProduits();
		return lst;
	}
}
