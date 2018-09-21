package ex3.photos.modeles;

import java.util.ArrayList;

public interface EnsemblePhotos {
	// ajouter une nouvelle photo
	void ajouterPhoto (Photo p) ; 

	// trier les photos selon l’année
	void trierSelonAnnee (); 

	// rechercher un mot-clé dans les commentaires et 
	// retourner un nouvel ensemble de références des photos 
	// qui ont ce mot-clé dans leur commentaire
	ArrayList rechercherMotCle (String motCle);
}
