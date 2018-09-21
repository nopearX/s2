package EX2;

public class Rec extends FormeGeometrique {
	private double largeur ; 
	private double hauteur ; 
	
	double perimetre() {
		return 2 * (largeur + hauteur);
	}

	double surface() {
		return largeur * hauteur ;
	}

	public Rec (double x, double y, double largeur, double hauteur) {
		super (x, y);
		this.largeur = largeur ; 
		this.hauteur = hauteur ;
	}
	
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

}
