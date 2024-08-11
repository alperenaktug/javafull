package javaDers28;

public class MethodsGeneralStructures {

	public static void main(String[] args) {
		
		// javada metot oluþturulurken ;		
		// (anahtar kelime) isim (parametre){		
		// yapýlan iþlemler
		
		toplama();
		System.out.println("Bir alt satýra geçiniz");
		
		toplama(2,3);
		toplama(20,45);
		
		
	   }
	
	   public static void toplama() { // parametresiz metot
		   System.out.println("Toplama iþlemi "
		   		+ " baþarý ile tamamlandý !! ");
		   System.out.println("Mehabalar nasýlsýnýz !!");

	}
	   public static void toplama(int sayi1 , int sayi2) { // parametreli metot
		 int toplam = sayi1 + sayi2 ;
		 System.out.println("Toplamý : " + toplam);

	}

}
