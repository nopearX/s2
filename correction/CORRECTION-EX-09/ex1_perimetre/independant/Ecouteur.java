package ex1_perimetre.independant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// Version avec une classe écouteur indépendante de la classe graphique
public class Ecouteur implements ActionListener {
	PerimetreObjet panel ;

	// Il faut mémoriser la référence vers le panel 
	// dans un attribut lors de l'appel au constructeur
	// afin d'y avoir accès dans la méthode actionPerformed 
	public Ecouteur(PerimetreObjet panel) {
		super();
		this.panel = panel;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("on a cliqué");
		JButton bouton = (JButton) e.getSource ();
		if (e.getActionCommand().equals(bouton.getActionCommand())) {
			// Récupérer les valeurs de la longueur et de la largeur
			double largeur = Double.parseDouble(panel.getTxtLargeur().getText());
			double longueur = Double.parseDouble(panel.getTxtLongeur().getText());
			double resultat = 2 * (largeur + longueur);
			panel.getLblValResultat().setText(""+resultat);
			
		} else if (e.getActionCommand().equals(bouton.getActionCommand())) {
			// Vider les champs de texte
			panel.getTxtLargeur().setText("");
			panel.getTxtLongeur().setText("");
		}
	} 	
}
