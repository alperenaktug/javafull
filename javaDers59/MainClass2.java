package javaDers59;

import java.util.HashMap;

public class MainClass2 {
	
	// HashMap :  ( key = value )
	// Anahtar bölümü benzersiz olmalý kopya içerik olamaz.
	
	
	public static void main(String[] args) {
		
		HashMap liste = new HashMap();
		
		
		liste.put(1, "Alperen"); // key value data eklenir .
		liste.put(2, "Furkan");
		liste.put(3, "Umut");
		
		
		System.out.print(liste);
		
		System.out.println();
		
		// Anahtarýn varlýðýný kontrol eder .
		System.err.println(liste.containsKey(2));
		
		// Eklenen datalarýn listesini alabiliyoruz.
		System.out.println(liste.entrySet());
		
		
		
		
		
		
		
	}

}
