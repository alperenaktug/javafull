package javaDers11;

import java.util.Scanner;

public class V�cutKitleEndeksi {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("L�tfen boyunuzu metre cinsinden giriniz  : ");
	
	float boy = input.nextFloat();
	
	System.out.println("L�tfen kilonuzu kilogram cinsinden giriniz : ");
	
	float kilo = input.nextFloat();
	
	
	float vke = kilo / (boy * boy) ;
	
	 System.out.println("V�cut Kitle Endeksizniz : " + vke );
	
	if(vke < 18.5 ) {
		
		System.out.println("Zay�fs�n daha fazla yemelisin");
	}	
	if (vke >= 18.5 && vke <= 25 ){
		
		System.out.println("�deal kilodas�n�z ");
	}
    if (vke >= 25 && vke <= 30) {
    	
    	System.out.println("Kilolusun biraz egzersiz yapmal�s�n");
    }
    if(vke >= 30) {
    	
    	 System.out.println("Obezlik sa�l���na dikkat etmelisin");
    }
			

}

}
