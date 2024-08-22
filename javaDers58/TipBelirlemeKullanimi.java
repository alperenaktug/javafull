package javaDers58;

import java.util.HashSet;
import java.util.TreeSet;

public class TipBelirlemeKullanimi {

	public static void main(String[] args) {
		
		
		HashSet<String> liste = new HashSet<>();
		
		
		liste.add("apple");
		liste.add("banana");
		liste.add("strawberry");
		
		System.out.println(liste);
		
		TreeSet<Integer> liste2 = new TreeSet<>();
		
		liste2.add(10);
		liste2.add(20);
		liste2.add(30);
		
		System.out.println(liste2);

	}

}
