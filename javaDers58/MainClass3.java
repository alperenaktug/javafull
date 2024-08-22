package javaDers58;

import java.util.TreeSet;

public class MainClass3 {
	
	// TreeSet : sıralı küme

	public static void main(String[] args) {
		
		TreeSet liste = new TreeSet();
		
		liste.add("Faruk");
		liste.add("Sabri");
		liste.add("Mustafa");
		liste.add("Mehmet");
		
		
		System.out.println(liste);
		
		System.out.println(liste.contains("Betül"));
		
		liste.remove("Sabri");
		
		System.out.println(liste);
		
		System.out.println(liste.size());
		

	}

}
