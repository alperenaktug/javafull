package javaDers57;

import java.util.LinkedList;

public class MainClass {
	
	/* List(Listeler) : 
	 * 
	 * LinkedList(Ba�l� Listeler) :
	 * */

	public static void main(String[] args) {
		
		LinkedList liste = new LinkedList();
		
		liste.add("Hamza");
		liste.add("Burak");
		liste.add("Hande");
		
		liste.addFirst("Deniz"); // ilk s�raya ekler
		liste.addLast("Tu�ba");  // son s�raya ekler
		
		System.out.println(liste);
		
		liste.remove("Burak"); // data kald�r�r
		liste.remove(2);
		System.out.println(liste);
		
		System.out.println(liste.get(0));
		

	}

}
