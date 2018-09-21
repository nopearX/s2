package bonuscalc;



import javax.swing.*;

// Version avec une d�claration de JButton par bouton
public class CalculatriceTableauPanel implements interfacemodele{

	public static int getNbBoutons() {
		return NB_BOUTONS;
	}

	JLabel resultat ; 
	final static int NB_BOUTONS = 16 ; 
	
	// D�clarer les composants graphiques
	final static String [] labels = {	
									"1", "2", "3", "+", 
									"4", "5", "6", "-", 
									"7", "8", "9", "x",
									"C/CE", "0", "=", "/"};
	
	public static String[] getLabels() {
		return labels;
	}

	public JLabel getResultat() {
		return resultat;
	}

	public void setResultat(JLabel resultat) {
		this.resultat = resultat;
	}
	
	public CalculatriceTableauPanel() {
		
	}

}
