package partie2;

public abstract class employe {
	
String nom;
String prenom;
int dateEntrer;
double salaire;
double prime;
protected double nbHeures;
public abstract double calculSalaire();
public abstract String getNom();
	public employe(String nomE, String prenomE, int date) {
		 this.nom = nomE;
		 this.prenom = prenomE;
		 this.dateEntrer =  date;
		 
	 }
}
