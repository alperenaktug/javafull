package javaDers17;

public class DiziKullanimi {

	public static void main(String[] args) {
		
		int sayi = 20 ;
		 int [] sayilar = new int[5]; //Verileri sonradan eklemek için  
		
		 sayilar[0] = 10;
		 sayilar[1] = 20; 
		 sayilar[2] = 30;
		 sayilar[3] = 40;
		 sayilar[4] = 50;
		 
		 sayilar[0] = 100; // deðer deðiþtirme iþlemi
     	System.out.println(sayilar[0]);
		
		/*
		  1. yol
		int [] sayilar = {10,20,30,40,50,60};	
		System.out.println(sayilar[0]);
		System.out.println(sayilar[1]);
		System.out.println(sayilar[2]);
		System.out.println(sayilar[3]);
		System.out.println(sayilar[4]);
		System.out.println(sayilar[5]);
		
		*/

	}

}
