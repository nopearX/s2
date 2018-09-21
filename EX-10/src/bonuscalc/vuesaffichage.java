package bonuscalc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class vuesaffichage extends JPanel implements interfacevue{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 JButton [] boutons ; 
	 CalculatriceTableauPanel m;
	 JLabel resultat2 ; 
	 
	 
	   vuesaffichage(CalculatriceTableauPanel m) {
		// TODO Auto-generated constructor stub
	
		// Cr�er le label pour afficher le r�sultat
		 
		resultat2 = m.getResultat();
		resultat2 = new JLabel ("0");
		m.getResultat().setBackground(Color.black);
		m.getResultat().setOpaque(true);
		m.getResultat().setForeground (Color.green);
		m.getResultat().setHorizontalTextPosition(JLabel.RIGHT);
		m.getResultat().setFont(new Font("Courier",Font.BOLD,48));
		m.getResultat().setPreferredSize(new Dimension(100,52));

		// Cr�er le tableau de boutons
		boutons = new JButton [CalculatriceTableauPanel.getNbBoutons()];
		
		// Mettre en page les boutons
		JPanel panelBoutons = new JPanel (); 
		panelBoutons.setLayout(new GridLayout(4,4));
		
		// Cr�er un �couteur ind�pendant
		EcouteurCalculatrice e = new EcouteurCalculatrice (this);
		
		// Creer les boutons et les ajouter au panel de boutons
		for (int i = 0; i < CalculatriceTableauPanel.getLabels().length; i++) {
			boutons [i] = new JButton (CalculatriceTableauPanel.getLabels()[i]);
			boutons [i].setActionCommand(CalculatriceTableauPanel.getLabels()[i]);
			panelBoutons.add(boutons [i]);
			
			// Ajouter l'�couteur � chaque bouton
			boutons [i].addActionListener(e);
			
			// Fixer la couleur
			switch (CalculatriceTableauPanel.getLabels()[i]) {
				case "C/CE":
				case "=":
				case "+":
				case "-" : 
				case "x":
				case "/": 
					boutons [i].setBorder(BorderFactory.createLineBorder(Color.red)); break ;
				default: boutons [i].setBorder(BorderFactory.createLineBorder(Color.blue)); 
			}
		}
		
		// Mettre en page le tout
		setLayout(new BorderLayout());
		add(m.getResultat(),BorderLayout.NORTH);
		add(panelBoutons,BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame("Calculatrice");
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalculatriceTableauPanel calcul = new CalculatriceTableauPanel();
		vuesaffichage vues2 = new vuesaffichage(calcul);
		fenetre.add(vues2);
		fenetre.setVisible(true);
	}

	public JLabel getResultat() {
		// TODO Auto-generated method stub
		return getResultat();
	}

}
