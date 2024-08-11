package javaDers28;

public class MethodsUse {

	public static void main(String[] args) {
		
		
		// 1- Parametreli Metot
		// 2- Parametresiz Metot
		
		System.out.println(arrayToplam(new int[] {10,20,30}));
		System.out.println(arrayToplam(new int[] {100,200,300}));
		System.out.println(arrayToplam(new int[] {112,2430,350}));

	}
	
	public static int arrayToplam(int[] sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {		
		     toplam += sayi ;
		}
		return toplam ;
	}

}
