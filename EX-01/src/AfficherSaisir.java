// EX A --------------------------------------------------

import java.util.Scanner;
public class AfficherSaisir {
	public static void main(String[] args){
		System.out.println("Bonjour");
		System.out.printf("affichage formaté : %1.3f", Math	.PI);
		System.out.println("\nSaisir un nombre n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (int) Math.random() * n;
		System.out.println("Vous avez choisi n comme : " +n+ "\nLe nombre aléatoire obtenu est : " +x);
	}
}
