package Pasquier;
import java.util.Scanner;

abstract public class FormeGeometrique {
private double x;
private double y;


public void Deplacer() {
	Scanner sc = new Scanner(System.in);
	System.out.println("veuillez saisir une coordonn�es:");
	int str = sc.nextInt();
	x = str;	
	System.out.println("veuillez saisir une coordonn�es:");
	str = sc.nextInt();	
	y = str;
	System.out.println("les nouvelles coordonn�es sont x: " + x + " y: " + y);	


}


	

public void AfficherPosition() {
	System.out.println("x: " + x + " y: " + y);
}

 public double getX() {
	return x;
}

public double getY() {
	return y;
}

public abstract double Perimetre();
public abstract double Surface();
	
}
//Est-ce que votre programme peut s�ex�cuter avec uniquement les classes Editeur et la classe abstraite FormeGeometrique ? 
//non il manque des choses
//Que faut-il d�autre ?
//il faut encore faire les formes