package javaDers11;

import java.util.Scanner;

public class Pratik2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("G�nde ka� bardak �ay i�iyorsunuz ?");
		int bardak = input.nextInt();
		
		System.out.println("Bir barda�a la� �eker at�yorsunuz ? ");
		int seker = input.nextInt();
		
		double year = (360  *  bardak * seker * 3 )/ 1000 ;
		double AltmisYear = ( 60 * 360  * bardak * seker * 3 )/ 1000 ;

	
	System.out.println("Y�lda kullan�lan �eker miktar� : " + year + " Kg");
	System.out.println("Y�lda kullan�lan �eker miktar� : " + AltmisYear + " Kg");
	
	
	if (year == 0 ) {
		System.out.println("Tebrikler , �eker t�ketmeyerek daha sa�l�kl� bir ya�am s�r�yorsunuz .");
	}
	if (year > 0 ) {
		System.out.println("Y�lda t�ketti�iniz �eker miktar� " + year + " Dikkatli olun" );
	}
}
		
}
