package fr.sh.TestHibernate03.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import fr.sh.TestHibernate03.modele.Categorie;
import fr.sh.TestHibernate03.persistence.HibernatePersistence;


public class ServiceMetier {

	private static Logger logger = LoggerFactory.getLogger(ServiceMetier.class);
	
	public List<Categorie> getLstCateg ()
	{
        Session session = HibernatePersistence.getSessionFactory().openSession();

        session.beginTransaction();

		logger.info("***************************************");
        logger.info( "Chargement des categories");
        logger.info( "***************************************");

        Query q = session.createQuery( "from Categorie" );
        List<Categorie> result = q.list();        
        //HibernatePersistence.shutdown();
        
        session.close();
        return result;
	}
	
	public Categorie getOneCateg(int i)
	{
        Session session = HibernatePersistence.getSessionFactory().openSession();

        session.beginTransaction();

		logger.info("***************************************");
        logger.info( "Chargement de la categorie:"+i);
        logger.info( "***************************************");

        Categorie c = (Categorie) session.get(Categorie.class, i );
        
        session.close();
        
        //HibernatePersistence.shutdown();
        
        return c;
	}
	
}
