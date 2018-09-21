package partie3;

public class Volaille {
	
	private double poids;
    private int numID;
	
	Volaille(double poids, int Id){
		this.poids = poids;
		this.numID = Id;
	}
	
	void changePoids(double np) {
		poids=np;
	}
	
	protected double prix() {
		return this.prix();
	}
	
	boolean assezGrosse() {
		return false;
	}
	
	public double getPoids() {
		return this.poids;
	}
	
	protected int getNumID() {
		return this.numID;
	}

	public Object getNumIdentification() {
		// TODO Auto-generated method stub
		return null;
	}
}

