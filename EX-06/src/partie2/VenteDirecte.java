	package partie2;

public class VenteDirecte extends employe{
	public VenteDirecte(String nomE, String prenomE, int date) {
		super(nomE, prenomE, date);
		// TODO Auto-generated constructor stub
	}

	double chiffreAffaire;
	
	

@Override
public double calculSalaire() {
	// TODO Auto-generated method stub
	return (double)(20 * chiffreAffaire / 100);
}



@Override
public String getNom() {
	// TODO Auto-generated method stub
	return nom+prenom;
}}
