package modele;

public class BandeDessinee extends Livre{

	
	private String dessinateur;
	
	public BandeDessinee(String auteur, String maisonImprimerie, String titre, int exemplaire, String dessinateur){
		super(auteur, maisonImprimerie, titre, exemplaire);
		this.dessinateur=dessinateur;	
	}
	
	public String getInfosHTML() {
		String s = new String();
		s+= "<html>Bande dessinée<br/><br/>";
		s+= super.getInfosHTML();
		s+= "Dessinateur : " + dessinateur + "</html>";
		
		return s;
	}

}
