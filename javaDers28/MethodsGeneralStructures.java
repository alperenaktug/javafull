package javaDers28;

public class MethodsGeneralStructures {

	public static void main(String[] args) {
		
		// javada metot olu�turulurken ;		
		// (anahtar kelime) isim (parametre){		
		// yap�lan i�lemler
		
		toplama();
		System.out.println("Bir alt sat�ra ge�iniz");
		
		toplama(2,3);
		toplama(20,45);
		
		
	   }
	
	   public static void toplama() { // parametresiz metot
		   System.out.println("Toplama i�lemi "
		   		+ " ba�ar� ile tamamland� !! ");
		   System.out.println("Mehabalar nas�ls�n�z !!");

	}
	   public static void toplama(int sayi1 , int sayi2) { // parametreli metot
		 int toplam = sayi1 + sayi2 ;
		 System.out.println("Toplam� : " + toplam);

	}

}
