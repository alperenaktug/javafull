package javaDers58;

import java.util.HashSet;

public class MainClass2 {
	
	// HashSet : Küme mantýðýnda oluþturulan liste .
	
	// Sýralý bir liste deðil ve aynýsý olmayan eleman
	// lardan oluþuyor .

	public static void main(String[] args) {
		
		HashSet liste = new HashSet();
		
		liste.add("Toyota");
		liste.add("Audi");
		liste.add("Renault");
		liste.add("Wolswogen");
		liste.add(100);
		liste.add(false);
		liste.add(100);
		
		System.out.print(liste);
		
		System.out.println();
		
		System.out.println(liste.contains("Toyota"));
		
		liste.remove("Audi");
		System.out.println(liste);
		
		System.out.println("Uzunluk : " + liste.size());
		


	}

}
