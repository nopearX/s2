package partie2;

public class Reprentation extends employe{
	public Reprentation(String nomE, String prenomE, int date) {
		super(nomE, prenomE, date);
		// TODO Auto-generated constructor stub
	}
	double chiffreAffaire;

	public double calculSalaire() {
		return (double)(30 * chiffreAffaire / 100);
	}

	@Override
	 public String getNom() {
		// TODO Auto-generated method stub
		return nom+prenom;
	}
}
