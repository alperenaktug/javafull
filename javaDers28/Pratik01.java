package javaDers28;

public class Pratik01 {
	public static void main(String[] args) {
		
		toplama(20,10);
		cikarma(20,10);
		carpma(20,10);
		bolme(20,10);
		
		
		
	}   
	
	  public static void toplama (int sayi1 , int sayi2) {
		  int toplam = sayi1 + sayi2 ;
		  System.out.println("Toplam : " + toplam);
	  }
	  
	  public static void cikarma (int sayi1 , int sayi2) {
		  int cikarma = sayi1 - sayi2 ;
		  System.out.println("Çýkarma : " + cikarma);
	  }
	  
	  public static void carpma (int sayi1 , int sayi2) {
		  int carpma = sayi1 * sayi2 ;
		  System.out.println("Çarpma : " + carpma);
	  }
	  
	  public static void bolme (int sayi1 , int sayi2) {
		  int bolme = sayi1 / sayi2 ;
		  System.out.println("Bölme : " + bolme);
	  }

}
