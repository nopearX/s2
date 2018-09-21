package EX2;

public class Cercle extends FormeGeometrique {
	private double rayon ; 
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public Cercle(double x, double y, double rayon) {
		super(x, y);
		this.rayon = rayon ;
	}

	double perimetre() {
		return 2 * Math.PI * rayon;
	}

	double surface() {
		return Math.PI * Math.pow(rayon, 2);
	}
	

}
