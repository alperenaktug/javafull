package javaDers40;

public class StaticKavrami {

	public static void main(String[] args) {
		
		// Static kavramý hafýza yönetimi için kulla
		// nýlýr . ve static kelimesinin kullanýldýðý
		// deðiþken hafýzada bir kere oluþturulur .
		
		// Mademn static deðiþken bir ker oluþturuluyor,
		// o zaman bir nesnenin static deðiþken deðeri deðiþtirilirse
		// tüm nesnelerin deðiþkeninin deðeri deðiimiþ olur .
		
		
		// Nesne oluþturmaya gerek kalmadan bir deðiþkeni
		// bir metodu kullanmak için static kavramýný kulanýrýz.
		// classIsmi.degiskenIsmi
		
		Araba nesne = new Araba(200,"mavi",6);
		
		//  nesne.model = 2020;
		
		System.out.println(nesne.hiz);
		System.out.println(nesne.renk);
		System.out.println(nesne.vites);
		System.out.println(Araba.model);
		
		Araba nesne2 = new Araba(100 ,"sarý",5);
		
		System.out.println(nesne2.hiz);
		System.out.println(nesne2.renk);
		System.out.println(nesne2.vites);
		System.out.println(nesne2.model);
		
		// Araba.deneme(); static deðil!!!
		 
        Araba.bilgi();  
	}

}
