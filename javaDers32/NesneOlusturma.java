package javaDers32;

public class NesneOlusturma {

	public static void main(String[] args) {
	
	// 	ClassIsmi nesneImi = new ClassIsmi();
		
		
		System.out.println("Araba Bilgileri");
		Araba passat = new Araba();
		
		System.out.println("Hýz : " + passat.maxHiz);
		System.out.println("Renk : " + passat.renk);
		System.out.println("Vites : " + passat.vites);
		System.out.println("Model : " + passat.model);
		
		System.out.println("-------------------");
		
		passat.calistir();
		passat.durdur();
		
	  System.out.println("----------------");
	  System.out.println("Kütüphane Bilgileri");
	  
	  Kutuphane library = new Kutuphane();
	  
	  System.out.println(library.kitapSayisi);
	  System.out.println(library.openTime);
	  System.out.println(library.closeTime);
	  
	  
	  System.out.println("------------------");
	  System.out.println("Öðrenci Bilgileri");
	  
	  Ogrenciler school = new Ogrenciler();
	  System.out.println("Öðrenci Sayýsý : " + school.ogrenciSayisi);
	  
	  school.kayitEkle();
	  school.kayitEkle();
	  school.kayitEkle();
	  
	  System.out.println("Öðrenci Sayýsý : " + school.ogrenciSayisi);
	
		
	}

}
