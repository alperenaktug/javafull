package javaDers52;

public class Interface {
	
	/* �nterfaceden nesne �retilmez .
	 * 
	 * Miras al�narak (implements) kullan�l�r .
	 * 
	 * Extends ifadesi ie de�il implements ifadesi
	 *  ile kullan�l�r.
	 *  
	 * Bir class birden fazla interface i miras alabilir
	 * ama birden fazla class � miras alamaz .
	 * 
	 * interface i�indeki metodlar asl�nda public abstract
	 * metotlard�r .
	 * 
	 * �nterface i�indek� de�i�kenlerin de�eri sonradan
	 * de�i�tirilemez . (final de�i�ken)
	 *
	 * */

	public static void main(String[] args) {
		
		
		Araba nesne = new Araba();
		
		nesne.bilgi();
		nesne.modelBilgileri();
	
		

	}

}
