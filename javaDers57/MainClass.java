package javaDers57;

import java.util.LinkedList;

public class MainClass {
	
	/* List(Listeler) : 
	 * 
	 * LinkedList(Bağlı Listeler) :
	 * */

	public static void main(String[] args) {
		
		LinkedList liste = new LinkedList();
		
		liste.add("Hamza");
		liste.add("Burak");
		liste.add("Hande");
		
		liste.addFirst("Deniz"); // ilk sıraya ekler
		liste.addLast("Tuğba");  // son sıraya ekler
		
		System.out.println(liste);
		
		liste.remove("Burak"); // data kaldırır
		liste.remove(2);
		System.out.println(liste);
		
		System.out.println(liste.get(0));
		

	}

}
