package dupont;
import java.util.Scanner;

import Pasquier.*;

public class Rec extends FormeGeometrique{
	private double lo;
private	double la;
	
public void modifRec() {
		Scanner mc = new Scanner(System.in);
		System.out.println("Veuillez entrer la longueur du rectangle");
		double str = mc.nextDouble();
		lo = str;
		System.out.println("Veuillez entrer la largeur du rectangle");
		str = mc.nextDouble();
		la = str;
	
	}
@Override
public double Perimetre() {
	// TODO Auto-generated method stub
	return 2 *(la + lo);
}
@Override
public double Surface() {
	// TODO Auto-generated method stub
	return la * lo;
}
}