package javaDers11;

public class IfElseKullanimi {

	public static void main(String[] args) {
		int sayi = 95;
		String diller = "arap�a , ingilizce , frans�zca , ispanyolca";
		
		if (sayi > 100) {
			System.out.println("say� 100 den b�y�kt�r ");
		}else {
			System.out.println("say� 100 den k���kt�r ");
		}
		
		
		if(diller.contains("t�rk�e")) {	
			System.out.println("Bu dillerin i�inde t�rk�e vard�r.");
		}
		else{
			System.out.println("Bu dillerin i�inde t�rk�e yoktur.");
		}

	}
	
	

}
