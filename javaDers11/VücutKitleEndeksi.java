package javaDers11;

import java.util.Scanner;

public class VücutKitleEndeksi {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lütfen boyunuzu metre cinsinden giriniz  : ");
	
	float boy = input.nextFloat();
	
	System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz : ");
	
	float kilo = input.nextFloat();
	
	
	float vke = kilo / (boy * boy) ;
	
	 System.out.println("Vücut Kitle Endeksizniz : " + vke );
	
	if(vke < 18.5 ) {
		
		System.out.println("Zayýfsýn daha fazla yemelisin");
	}	
	if (vke >= 18.5 && vke <= 25 ){
		
		System.out.println("Ýdeal kilodasýnýz ");
	}
    if (vke >= 25 && vke <= 30) {
    	
    	System.out.println("Kilolusun biraz egzersiz yapmalýsýn");
    }
    if(vke >= 30) {
    	
    	 System.out.println("Obezlik saðlýðýna dikkat etmelisin");
    }
			

}

}
