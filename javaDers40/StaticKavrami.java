package javaDers40;

public class StaticKavrami {

	public static void main(String[] args) {
		
		// Static kavram� haf�za y�netimi i�in kulla
		// n�l�r . ve static kelimesinin kullan�ld���
		// de�i�ken haf�zada bir kere olu�turulur .
		
		// Mademn static de�i�ken bir ker olu�turuluyor,
		// o zaman bir nesnenin static de�i�ken de�eri de�i�tirilirse
		// t�m nesnelerin de�i�keninin de�eri de�iimi� olur .
		
		
		// Nesne olu�turmaya gerek kalmadan bir de�i�keni
		// bir metodu kullanmak i�in static kavram�n� kulan�r�z.
		// classIsmi.degiskenIsmi
		
		Araba nesne = new Araba(200,"mavi",6);
		
		//  nesne.model = 2020;
		
		System.out.println(nesne.hiz);
		System.out.println(nesne.renk);
		System.out.println(nesne.vites);
		System.out.println(Araba.model);
		
		Araba nesne2 = new Araba(100 ,"sar�",5);
		
		System.out.println(nesne2.hiz);
		System.out.println(nesne2.renk);
		System.out.println(nesne2.vites);
		System.out.println(nesne2.model);
		
		// Araba.deneme(); static de�il!!!
		 
        Araba.bilgi();  
	}

}
