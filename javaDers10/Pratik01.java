package javaDers10;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("L�tfen birinci say�y� giriniz : ");
		int sayi = scanner.nextInt();
		
		System.out.println("L�tfen ikinci say�y� giriniz : ");
		int sayi2 = scanner.nextInt();
		
		int toplam = sayi + sayi2 ;
		int fark = sayi - sayi2 ;
		int carpma = sayi * sayi2 ;
		int bolme = sayi / sayi2 ;
		
		System.out.println("�ki say�n�n toplam� : " +toplam);
		System.out.println("�ki say�n�n fark� : " +fark);
		System.out.println("�ki say�n�n carp�m� : " +carpma);
		System.out.println("�ki say�n�n b�l�m� : " + bolme);

	}

}
