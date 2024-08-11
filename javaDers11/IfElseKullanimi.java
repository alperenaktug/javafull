package javaDers11;

public class IfElseKullanimi {

	public static void main(String[] args) {
		int sayi = 95;
		String diller = "arapça , ingilizce , fransýzca , ispanyolca";
		
		if (sayi > 100) {
			System.out.println("sayý 100 den büyüktür ");
		}else {
			System.out.println("sayý 100 den küçüktür ");
		}
		
		
		if(diller.contains("türkçe")) {	
			System.out.println("Bu dillerin içinde türkçe vardýr.");
		}
		else{
			System.out.println("Bu dillerin içinde türkçe yoktur.");
		}

	}
	
	

}
