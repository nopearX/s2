package partie2;

public class Manutention extends employe{
	final static int prime = 200;
	public Manutention(String nomE, String prenomE, int date) {
		super(nomE, prenomE, date);
		// TODO Auto-generated constructor stub
	}

	double nbHeures;

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return (double)(nbHeures*15 + prime);
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom+prenom;
	}
}
