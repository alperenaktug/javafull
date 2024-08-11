package javaDers29;

public class MetotlardaReturnTip {

	public static void main(String[] args) {
		
		bilgiGoster();
		
		int sonuc = toplam(20,50);
		
		System.out.println(sonuc);
		
		
	}
	
	
	public static void bilgiGoster() {
		System.out.println("Merhbalar , Hoþgeldiniz !!");
	}
	
	
	
	public static int toplam (int sayi1 , int sayi2 ) {
		int toplam = sayi1 + sayi2 ;
		
		return toplam ;
	}

}
