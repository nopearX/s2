package calculatrice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCalculatrice extends JPanel {
	
	
	private	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bm,bd,bs,be,bc,bp;
	private JLabel resultat = new JLabel() ; 
	public PanelCalculatrice() {
		
		
		// Mettre en page les boutons
		JPanel panelBoutons = new JPanel (); 
		panelBoutons.setLayout(new GridLayout(4,4));
		
		// Creer les boutons et les ajouter au panel de boutons
		b1 = new JButton("1"); panelBoutons.add(b1); 
		b2 = new JButton("2"); panelBoutons.add(b2); 
		b3 = new JButton("3"); panelBoutons.add(b3); 
		ba = new JButton("+"); panelBoutons.add(ba); 
		
		b4 = new JButton("4"); panelBoutons.add(b4); 
		b5 = new JButton("5"); panelBoutons.add(b5); 
		b6 = new JButton("6"); panelBoutons.add(b6); 
		bs = new JButton("-"); panelBoutons.add(bs); 
		
		b7 = new JButton("7"); panelBoutons.add(b7); 
		b8 = new JButton("8"); panelBoutons.add(b8); 
		b9 = new JButton("9"); panelBoutons.add(b9); 
		bm = new JButton("x"); panelBoutons.add(bm); 
		
		bc = new JButton("C/CE"); panelBoutons.add(bc); 
		b0 = new JButton("0"); panelBoutons.add(b0); 
		be = new JButton("="); panelBoutons.add(be); 
		bd = new JButton("/"); panelBoutons.add(bd); 
		
		resultat.setPreferredSize(new Dimension(20, 50));

		setLayout(new BorderLayout());
		add(resultat,BorderLayout.NORTH);
		add(panelBoutons,BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creer une fenetre
		JFrame f = new JFrame ("Calculatrice");

		// Ajouter a la fenetre la calculatrice
		PanelCalculatrice c = new PanelCalculatrice (); 
		f.getContentPane().add(c);
		
		// Afficher la fenetre
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,300);
		f.setVisible(true);
	}

}
