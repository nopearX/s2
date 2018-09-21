package dupont;
import Pasquier.*;
public class TestDupont{
	  public static void main (String args[]) {

	    // M. Dupont cree un rectangle 
	Rec rectangle = new Rec();
	    // M. Dupont appelle les methodes developpees par M. Pasquier 
	    // Il est *oblige* de passer a la methode afficherStats un objet
	//instance d'une classe implementant la classe abstraite FormeGeometrique
	    Editeur ed = new Editeur ();
	    ed.afficherStats(rectangle);

	    // Changer les coordonn�es de la forme en appelant la m�thode d�placer
	    rectangle.Deplacer();
	    rectangle.modifRec();
	     // Demander de nouveau d�afficher des statistiques sur cette forme
	    ed.afficherStats(rectangle);
	    
	    
	    // Idem avec un cercle 
	    Cercle cercle = new Cercle();
	    ed.afficherStats(cercle);
	    cercle.Deplacer();
	    cercle.modifCercle();
	    ed.afficherStats(cercle);
	  }
	}
