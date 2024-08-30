package javaDers61;

import java.util.Scanner;

public class HataYakalama {
	
	/* s�z dizimi yanl��l�klar� (syntax errors)
	 * mant�ksal yanl��l�klar (logical errors)
	 * ko�ma-zaman� yanl��kl�klar�(run-time errors)
	 * try-catch-finally
	 * throw ,throws 
	 * */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ilk say� : ");
		int ilkSayi = input.nextInt();
		
		System.out.println("ikinci say� : ");
		int ikinciSayi = input.nextInt();
		
		int sonuc = 0 ;
		
		try {
			sonuc = ilkSayi / ikinciSayi ;
			
		} catch (Exception e) {
			System.out.println("Hata olu�tu" + e);
		}
			finally {
				System.out.println("Hata i�lemine bak�ld� ekstra bir kod yazmak i�in kullan�l�r");
			}
			
		
		
		System.out.println("Sonu� : " + sonuc);
		
		
		
		

	}

}
