package javaDers29;

public class Pratik01 {
	public static void main(String[] args) {
		
		int result = toplama(40,20);
		System.out.println(result);
		
		int result2 = cikarma(40,20);
		System.out.println(result2);
		
		int result3 = carpma(40,20);
		System.out.println(result3);
		
		int result4 = bolme(40,20);
		System.out.println(result4);
		
	}
	
	public static int toplama (int sayi1 , int sayi2) {
		int toplam = sayi1 + sayi2 ;
		
		return toplam ;
	}
	
	public static int cikarma (int sayi1 , int sayi2) {
		int toplam = sayi1 - sayi2 ;
		
		return toplam ;
	}
	
	public static int carpma (int sayi1 , int sayi2) {
		int toplam = sayi1 * sayi2 ;
		
		return toplam ;
	}
	
	public static int bolme (int sayi1 , int sayi2) {
		int toplam = sayi1 / sayi2 ;
		
		return toplam ;
	}

}
