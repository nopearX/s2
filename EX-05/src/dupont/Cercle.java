package dupont;
import java.util.Scanner;

import Pasquier.*;

public class Cercle extends FormeGeometrique{
	double rayon;
	
public double Perimetre() {
	return 2* Math.PI * rayon;
}
public double Surface() {
	return  Math.PI * rayon*rayon;
}
public void modifCercle() {
	Scanner vc = new Scanner(System.in);
	System.out.println("Veuillez entrer le rayon ");
	double str = vc.nextDouble();
	rayon = str;

}
}
