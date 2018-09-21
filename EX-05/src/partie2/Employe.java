package partie2;

public class Employe extends salarie {

	public Employe(double salaire, String nom) {
		super(salaire, nom);
	}

	public void verserSalaire() {
		System.out.println("Versement de salaire sur compte externe : " + getNom() + ", " + getSalaire());
	}
}
