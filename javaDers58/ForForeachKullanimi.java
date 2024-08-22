package javaDers58;

import java.util.HashSet;
import java.util.TreeSet;

public class ForForeachKullanimi {

	public static void main(String[] args) {
		
		
		HashSet <Integer> liste = new HashSet<>();
		
		liste.add(100);
		liste.add(200);
		liste.add(300);
		
		TreeSet <String> liste2 = new TreeSet<>();
		
		liste2.add("gs");
		liste2.add("fb");
		liste2.add("bjk");
		
		
		
		for(int numbers : liste) {
			System.out.print(numbers + " ");
		}
		
		System.out.println();
		
		for(String clubs : liste2) {
			System.out.print(clubs + " ");
		}
		

	}

}
