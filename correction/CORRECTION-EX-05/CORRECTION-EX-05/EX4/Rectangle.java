package EX4;
public class Rectangle {
	private double longueur, largeur;
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		if ( longueur >=  0)
			this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		if ( largeur >=  0)
			this.largeur = largeur;
	}
	public double calculAire(){
		return largeur*longueur;
	}
	public Rectangle() {} ; 
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
}
