package javaDers61;

import java.util.Scanner;

public class HataYakalama {
	
	/* söz dizimi yanlýþlýklarý (syntax errors)
	 * mantýksal yanlýþlýklar (logical errors)
	 * koþma-zamaný yanlýþklýklarý(run-time errors)
	 * try-catch-finally
	 * throw ,throws 
	 * */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ilk sayý : ");
		int ilkSayi = input.nextInt();
		
		System.out.println("ikinci sayý : ");
		int ikinciSayi = input.nextInt();
		
		int sonuc = 0 ;
		
		try {
			sonuc = ilkSayi / ikinciSayi ;
			
		} catch (Exception e) {
			System.out.println("Hata oluþtu" + e);
		}
			finally {
				System.out.println("Hata iþlemine bakýldý ekstra bir kod yazmak için kullanýlýr");
			}
			
		
		
		System.out.println("Sonuç : " + sonuc);
		
		
		
		

	}

}
