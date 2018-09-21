package EX4;
public class TestRectangle {
	private Rectangle rectangleATester;
	public static void main(String... args)
	{
		// Tester la classe Rectangle
		Rectangle R  = new Rectangle();
		TestRectangle test = new TestRectangle(R);
		// Appeler la méthde test.isRectangleValide
		// qui testera les méthodes avec différentes 
		// valeurs des attributs du rectangle R
		System.out.println(test.isRectangleValide());
		
		
		// Un Carré EST UN Rectangle
		// donc un carré doit aussi passer le test !
		Rectangle C  = new Carre();
		test = new TestRectangle(C);
		// Appeler la méthde test.isRectangleValide
		// qui testera les méthodes avec différentes 
		// valeurs des attributs du rectangle R
		System.out.println(test.isRectangleValide());
		
	}
	TestRectangle(Rectangle R)
	{
		rectangleATester = R;
	}
	public boolean isRectangleValide()
	{
		return testAire() && testLongueur() &&  testLargeur();
	}
	private boolean testAire() {
		boolean cas0,casNormal;
			
		rectangleATester.setLargeur(0);
		rectangleATester.setLongueur(1);
		cas0 = (rectangleATester.calculAire() == 0 );
		
		rectangleATester.setLargeur(100);
		rectangleATester.setLongueur(1);
		casNormal = (rectangleATester.calculAire() == 100 );
		
		return cas0 && casNormal;
	}	
	// ici je supose qu'une valeur < 0 ne change pas la valeur 
	// mettre un 0 est valide aussi en fonction de ce qui a Ã©tÃ© defini. 
	private boolean testLongueur () {
	
		boolean casFail,cas0,casNormal;
		
		double valeur =  rectangleATester.getLongueur();
		rectangleATester.setLongueur(-1);
		casFail = (rectangleATester.getLongueur() == valeur );
		
		rectangleATester.setLongueur(0);
		cas0 = (rectangleATester.getLongueur() == 0 );
		
		rectangleATester.setLongueur(666.1337);
		casNormal = (rectangleATester.getLongueur() == 666.1337 );
		
		return casFail&&cas0&&casNormal;
	}
	
	private boolean testLargeur () {
		
		boolean casFail,cas0,casNormal;
		
		double valeur =  rectangleATester.getLargeur();
		rectangleATester.setLargeur(-1);
		casFail = (rectangleATester.getLargeur() == valeur );
		
		rectangleATester.setLargeur(0);
		cas0 = (rectangleATester.getLargeur() == 0 );
		
		rectangleATester.setLargeur(666.1337);
		casNormal = (rectangleATester.getLargeur() == 666.1337 );
		
		return casFail&&cas0&&casNormal;
	}
	


	// LA SOLUTION EST DE PAS FAIRE HeRITER CARRE DE RECTANGE MAIS TOUS LES DEUX DE "FORME"
}
