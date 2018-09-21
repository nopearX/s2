package ex3.photos.modeles;

import java.util.ArrayList;

public interface EnsemblePhotos {
	// ajouter une nouvelle photo
	void ajouterPhoto (Photo p) ; 

	// trier les photos selon l�ann�e
	void trierSelonAnnee (); 

	// rechercher un mot-cl� dans les commentaires et 
	// retourner un nouvel ensemble de r�f�rences des photos 
	// qui ont ce mot-cl� dans leur commentaire
	ArrayList rechercherMotCle (String motCle);
}
