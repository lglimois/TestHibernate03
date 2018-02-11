# TEST HIBERNATE 03

## Points testés:
Utilisation des fichiers de mapping hbm
Activation du cache de niveau 2

get: passe par le cache

query.list: ne passe pas par le cache

commentaire classe dans le fichier ehcache.xml: fonctionne (doit venir du defaut cache)

Un produit avec categorie et cache n-2: charge à chaque fois le produit mais la catégorie est lue en cache.

query list produit + categorie: 
	1- charge les produits + la categ
	2- charge uniquement les produits

	NOTE: si pas de cache: appel les requetes à chaque fois..

## Points à tester:
	Probleme si Lazy=proxy alors que l'on est dans le controller
	
Jprofiler
