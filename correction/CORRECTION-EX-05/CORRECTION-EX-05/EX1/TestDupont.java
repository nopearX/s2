package EX2;

public class TestDupont{
	  public static void main (String args[]) {

	    // M. Dupont cree un rectangle 
		  Rec r = new Rec (10, 10, 10, 20);

	    // M. Dupont appelle les methodes developpees par M. Pasquier 
	    // Il est *oblige* de passer a la methode afficherStats 
		// un objet instance d'une classe implementant 
		// la classe abstraite FormeGeometrique
	    Editeur ed = new Editeur ();
	    ed.afficherStats(r);

	    // Idem avec un cercle 
	    Cercle c = new Cercle (10, 10, 10);
	    ed.afficherStats(c);
	  }
	}