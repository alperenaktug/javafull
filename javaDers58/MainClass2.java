package javaDers58;

import java.util.HashSet;

public class MainClass2 {
	
	// HashSet : K�me mant���nda olu�turulan liste .
	
	// S�ral� bir liste de�il ve ayn�s� olmayan eleman
	// lardan olu�uyor .

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
