import java.util.Scanner;
/* 
 * Le fichier AfficherSaisir.class résultant de la compilation sera dans 
 * le dossier bin du dossier du projet dans le workspace. 
 * Par exemple dans le dossier : C:\Users\martin\Documents\ECLIPSE-WORKSPACE\2014-01-31-EX-01\bin
 */
public class AfficherSaisir {
	public static void main (String args []) {
		System.out.println ("Bonjour");
		System.out.printf ("Valeur de PI : %.3f", Math.PI);
		System.out.println ();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier : ");
		int j = sc.nextInt();
		System.out.println("Vous avez saisi : " + j); 
		System.out.println("Un nombre aléatoire entre 0 et " + j + " : " + 
				Math.random()*j); 
		sc.close();
		
	}
}
