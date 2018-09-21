package EX2;

public abstract class FormeGeometrique {
	protected double x ; 
	protected double y ; 
	void deplacer (double x2, double y2) {
		x = x2 ; 
		y = y2 ; 
	}
	void afficher () {
		System.out.println("x = " + x + ", y = " + y);
	}
	
	FormeGeometrique (double x, double y) {
		this.x = x ; 
		this.y = y ; 
	}
	
	// METHODES ABSTRAITES
	abstract double perimetre (); 
	abstract double surface (); 

	// ACCESSEURS
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}






