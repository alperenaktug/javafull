package javaDers11;

import java.util.Scanner;

public class Pratik2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Günde kaç bardak çay içiyorsunuz ?");
		int bardak = input.nextInt();
		
		System.out.println("Bir bardaða laç þeker atýyorsunuz ? ");
		int seker = input.nextInt();
		
		double year = (360  *  bardak * seker * 3 )/ 1000 ;
		double AltmisYear = ( 60 * 360  * bardak * seker * 3 )/ 1000 ;

	
	System.out.println("Yýlda kullanýlan þeker miktarý : " + year + " Kg");
	System.out.println("Yýlda kullanýlan þeker miktarý : " + AltmisYear + " Kg");
	
	
	if (year == 0 ) {
		System.out.println("Tebrikler , þeker tüketmeyerek daha saðlýklý bir yaþam sürüyorsunuz .");
	}
	if (year > 0 ) {
		System.out.println("Yýlda tükettiðiniz þeker miktarý " + year + " Dikkatli olun" );
	}
}
		
}
