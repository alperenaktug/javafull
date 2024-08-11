package javaDers10;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen birinci sayýyý giriniz : ");
		int sayi = scanner.nextInt();
		
		System.out.println("Lütfen ikinci sayýyý giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int toplam = sayi + sayi2 ;
		int fark = sayi - sayi2 ;
		int carpma = sayi * sayi2 ;
		int bolme = sayi / sayi2 ;
		
		System.out.println("Ýki sayýnýn toplamý : " +toplam);
		System.out.println("Ýki sayýnýn farký : " +fark);
		System.out.println("Ýki sayýnýn carpýmý : " +carpma);
		System.out.println("Ýki sayýnýn bölümü : " + bolme);

	}

}
