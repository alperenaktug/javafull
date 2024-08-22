package javaDers56;

import java.util.ArrayList;

public class IndexKullanimi {
	
	/* ArrayList : istenilen indexe veri eklemek ya da 
	 * istenilen indexten data çıkarmak
	 * */

	public static void main(String[] args) {
		
		ArrayList<String> liste = new ArrayList<>();
		
		liste.add("Hamza");
		liste.add("Murat");
		liste.add("Banu");
		
		liste.add(0, "Ayşe");
		liste.add(2, "Burak");
		
		System.out.println(liste);
		

	}

}
