package EX3;

public class Employe extends Salarie {

	public Employe(double salaire, String nom) {
		super(salaire, nom);
	}

	public void verserSalaire() {
		System.out.println("Versement de salaire sur compte externe : " + getNom() + ", " + getSalaire());
	}
}
