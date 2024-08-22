package javaDers57;

import java.util.LinkedList;

public class ForForeachKullanimi {

	public static void main(String[] args) {
		
		LinkedList<String> liste = new LinkedList<>();
		
		liste.add("Berk");
		liste.add("Aleyna");
		liste.add("Enes");
		liste.add("Bekir");
		
		for (int i = 0 ; i < liste.size() ; i++) {
			System.out.print(liste.get(i) + " ");
		}
		
		System.out.println();
		
		for (int i = liste.size() - 1 ; i >= 0 ; i--) {
			System.out.print(liste.get(i) + " ");
		}
		
		System.out.println();
		
		for(String isim : liste) {
			System.out.print(isim + " ");
		}

	}

}
