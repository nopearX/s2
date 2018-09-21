package perimetre;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPerimetre extends JPanel{
	
	
	public PanelPerimetre() {
		JLabel lblText = new JLabel();
		JLabel lblText1 = new JLabel();
		JLabel lblText2 =  new JLabel();
		JTextField t1 = new JTextField(20);
		t1.setSize(5, 20);
		JTextField t2 = new JTextField(20);
		t2.setSize(5, 20);
		JLabel lblResult = new JLabel();
		JButton btn1 = new JButton();
		btn1.setText("Calculer");
		JButton btn2 = new JButton();
		btn2.setText("Nettoyer");
		setLayout(new GridLayout (4,2));
		lblText.setText("Longueur : ");
		lblText1.setText("Largueur : ");
		lblText2.setText("Résulat : ");
		this.setPreferredSize(new Dimension(400,300));
		
		//p.add(l);
		add(lblText);
		add(t1);
		add(lblText1);
		add(t2);
		add(lblText2);
		add(lblResult);
		add(btn1);
		add(btn2);
		
	}

	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("calcul perimetre");
		PanelPerimetre pnl = new PanelPerimetre();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.getContentPane().add(pnl);
		fenetre.setVisible(true);
		fenetre.pack();
	}

}
