package javaDers52;

public class Interface {
	
	/* Ýnterfaceden nesne üretilmez .
	 * 
	 * Miras alýnarak (implements) kullanýlýr .
	 * 
	 * Extends ifadesi ie deðil implements ifadesi
	 *  ile kullanýlýr.
	 *  
	 * Bir class birden fazla interface i miras alabilir
	 * ama birden fazla class ý miras alamaz .
	 * 
	 * interface içindeki metodlar aslýnda public abstract
	 * metotlardýr .
	 * 
	 * Ýnterface içindekþ deðiþkenlerin deðeri sonradan
	 * deðiþtirilemez . (final deðiþken)
	 *
	 * */

	public static void main(String[] args) {
		
		
		Araba nesne = new Araba();
		
		nesne.bilgi();
		nesne.modelBilgileri();
	
		

	}

}
