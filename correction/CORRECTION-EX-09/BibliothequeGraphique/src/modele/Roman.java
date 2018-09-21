package modele;


public class Roman extends Livre {
	
	public static final int SF         = 0;
	public static final int AVENTURE   = 1;
	public static final int POLICIER   = 2;
	public static final int FANTASY    = 3;
	

	private int genre;
	
	
	public Roman(String auteur, String maisonImprimerie, String titre, int exemplaire, int genre){
		super(auteur, maisonImprimerie, titre, exemplaire);
		this.genre=genre;	
	}
	
	private String getGenre () {
		switch(genre){
		case SF : return "Science-Fiction";
		case AVENTURE : return "Aventure";
		case POLICIER : return "Policier";
		case FANTASY : return "Fantasy";
		default : return "Inconnu";
		}
	}

	public String getInfosHTML() {
		String s = new String();
		s+= "<html>Roman<br/><br/>";
		s+= super.getInfosHTML();
		s+= "Genre : " + getGenre() + "</html>";
		
		return s;
	}

	
}