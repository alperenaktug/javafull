package javaDers11;

import java.util.Random;

public class Pratik3 {

	public static void main(String[] args) {
	
		Random rastgele = new Random();
		
		int sayi = rastgele.nextInt(100);
		
		System.out.println(sayi);
		
		
		if (sayi <= 25) {
			System.out.println("Say� 0-25 aral���ndad�r.");
		}
		if (sayi > 25 && sayi <= 50) {
			System.out.println("Say�  25-50 aral���ndad�r .");
		}
		if (sayi > 50){
			System.out.println("Say� 50-100 aral���ndad�r.");
		}
	}

}
