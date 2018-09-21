package perimetre;


import java.awt.GridLayout;


import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame("calcul perimetre");
	fenetre.setSize(500,300);
		JPanel p = new JPanel();
	
		JLabel lblText = new JLabel();
		JLabel lblText1 = new JLabel();
		JLabel lblText2 =  new JLabel();
		JLabel lblResult = new JLabel();
		JTextField t1 = new JTextField(20);
		t1.setSize(5, 20);
		JTextField t2 = new JTextField(20);
		t2.setSize(5, 20);
		
		JButton btn1 = new JButton();
		btn1.setText("Calculer");
		JButton btn2 = new JButton();
		btn2.setText("Nettoyer");
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fenetre.add(p);
		//p.add(l);
		p.add(lblText);
		p.add(t1);
		p.add(lblText1);
		p.add(t2);
		p.add(lblText2);
		p.add(lblResult);
		p.add(btn1);
		p.add(btn2);
		p.setLayout(new GridLayout (4,2));
		lblText.setText("Longueur : ");
		lblText1.setText("Largueur : ");
		lblText2.setText("Résulat : ");
		fenetre.getContentPane().add(p);
		fenetre.setVisible(true);
		
		
	


	}}
