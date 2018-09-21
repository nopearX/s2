package partie5;

class Mediane implements MinMax{
	// Polymorphisme au niveau du paramètre qui est de type "interface"
	public int mediane(MinMax mm) {
		return((mm.minimum()+mm.maximum())/2) ;
	}
	
	public int mediane(MinMaxPaire mmPaire) {
		// TODO Auto-generated method stub
		return((mmPaire.minimum()+mmPaire.maximum())/2) ;
	}
	public int mediane(MinMaxTriplet mmTriplet) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main (String args []) {
		Mediane med = new Mediane ();
		MinMaxPaire mmPaire = new MinMaxPaire (); 
		mmPaire.setV1 (10); 
		mmPaire.setV2 (20); 

		System.out.println ("Valeur mediane pour une paire : " + med.mediane(mmPaire)); 

		MinMaxTriplet mmTriplet = new MinMaxTriplet();
		mmTriplet.setV1 (10); 
		mmTriplet.setV2 (20); 	   
		mmTriplet.setV3 (30); 	   
		System.out.println ("Valeur mediane pour un triplet : " + med.mediane(mmTriplet)); 
	}
	
	
	@Override
	public int minimum() {
return 0;
	}
	@Override
	public int maximum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
