package partie2;

public class Production extends employe{
	final static int prime = 200;
	 public Production(String nomE, String prenomE, int date) {
		super(nomE, prenomE, date);
		// TODO Auto-generated constructor stub
	}
	 
	 
	
	 public double calculSalaire() {
		 
		return 	 (double) (10 * nbHeures + prime);
		}

	

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom+prenom;
	}

}
