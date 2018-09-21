package partie2;

public abstract class salarie {
	private double salaire ; 
	
	// pourrait aussi Ítre dÈfini seulement dans Employe
	private String nom ;

	public abstract void verserSalaire ();
	
	protected salarie(double salaire, String nom) {
		this.salaire = salaire;
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	} 
}
