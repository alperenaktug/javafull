package javaDers51;

public class Overloading {

	public static void main(String[] args) {

     int result = toplama(10 ,30);
     int result2 = toplama(10,20,30);
     
     System.out.println(result);
     System.out.println(result2);

	}
	
	public static int toplama(int sayi1 , int sayi2) {
		return sayi1 + sayi2 ;
	}
	
	
	public static int toplama(int sayi1 , int sayi2 , int sayi3) {
		return sayi1 + sayi2 + sayi3 ;
	}

}
