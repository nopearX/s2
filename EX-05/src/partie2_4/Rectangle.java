package partie2_4;

public class Rectangle {
	private double longueur;
	private double largeur;
	
	public Rectangle() {} //constructeur vide
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}


public double getLongueur() {
	return longueur;
}
public double getLargeur() {
	return largeur;
}

public void setLongueur(double longueur) {
	if(longueur >= 0)
		this.longueur = longueur;
}
public void setLargeur(double largeur) {
	
	if(largeur >= 0 )
		this.largeur = largeur;
}

double aireRectangle() {
	double aire;
	aire = longueur * largeur;
	return aire;
}
}


//package EX4;
//ublic class Rectangle {
//	private double longueur, largeur;
//	public double getLongueur() {
///		return longueur;
	//}
//	public void setLongueur(double longueur) {
//		if ( longueur >=  0)
//			this.longueur = longueur;
//	}
//	public double getLargeur() {
//		return largeur;
//	}
//	public void setLargeur(double largeur) {
//		if ( largeur >=  0)
//			this.largeur = largeur;
//	}
//	public double calculAire(){
//		return largeur*longueur;
//	}
//	public Rectangle() {} ; 
//	public Rectangle(double longueur, double largeur) {
//		super();
//		this.longueur = longueur;
//		this.largeur = largeur;
//	}
//}

