package fr.sh.TestHibernate03.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.sh.TestHibernate03.dto.ProduitDto;
import fr.sh.TestHibernate03.modele.Categorie;
import fr.sh.TestHibernate03.modele.Produit;
import fr.sh.TestHibernate03.persistence.HibernatePersistence;

public class ServiceMetier {

	private static Logger logger = LoggerFactory.getLogger(ServiceMetier.class);

	public List<ProduitDto> getLstProduits() {
		logger.info("getLstProduits debut ");
		
		List<ProduitDto> lstdto = new ArrayList<>();
		
		Session session = HibernatePersistence.getSessionFactory().openSession();
		session.beginTransaction();

		Query q = session.createQuery("from Produit where id= :val1 or id= :val2");
		q.setParameter("val1", 3);
		q.setParameter("val2", 4);
		List result = q.list();
		// List result = session.createQuery( "from Product" ).list();
		for (Produit produit : (List<Produit>) result) {
			ProduitDto dto = new ProduitDto(produit.getNom(), produit.getLibelle(), "");
			
			logger.info("  produit" + produit);

			logger.info("  ------------------------");
			logger.info("  |                      |");
			logger.info("  |  Attente             |");
			logger.info("  |                      |");
			logger.info("  ------------------------");

			Categorie cur = produit.getCategorie();
			dto.setCategnom(cur.getNom());
			logger.info("    categorie du produit:" + cur);
			lstdto.add(dto);
		}
		session.close();
		logger.info("getLstProduits fin ");
		return lstdto;
	}

	public List<Categorie> getLstCateg() {
		Session session = HibernatePersistence.getSessionFactory().openSession();

		session.beginTransaction();

		logger.info("***************************************");
		logger.info("Chargement des categories");
		logger.info("***************************************");

		Query q = session.createQuery("from Categorie");
		List<Categorie> result = q.list();
		// HibernatePersistence.shutdown();

		session.close();
		return result;
	}

	public Produit getOneProduit(int i) {
		Session session = HibernatePersistence.getSessionFactory().openSession();

		session.beginTransaction();

		logger.info("***************************************");
		logger.info("Chargement du produit:" + i);
		logger.info("***************************************");

		Produit c = (Produit) session.get(Produit.class, i);

		session.close();

		// HibernatePersistence.shutdown();

		return c;
	}

	
	public Categorie getOneCateg(int i) {
		Session session = HibernatePersistence.getSessionFactory().openSession();

		session.beginTransaction();

		logger.info("***************************************");
		logger.info("Chargement de la categorie:" + i);
		logger.info("***************************************");

		Categorie c = (Categorie) session.get(Categorie.class, i);

		session.close();

		// HibernatePersistence.shutdown();

		return c;
	}

}
