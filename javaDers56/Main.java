package javaDers56;

import java.util.ArrayList;

public class Main {
	/* ArrayList :
	 * Liste uzunluðu dinamiktir .
	 * Ýçerisinde farklý tipte datalar tutabilir.
	 * 
	 * */

	public static void main(String[] args) {
		
		ArrayList isimler = new ArrayList();
		
	// 	add() : Veri eklemek için
	//  get() : Ýstenilen indexten veri almak için	
	//  remove() : Verileri silmek için 
	//  size() : ArrayList de kaç tane data var söyler.
	//  clear() : Tüm elemanlarý listeden temizler .
	//  contains() : Herhangi bir datanýn listede olup olmadýðýný söyler
	//  indexOf() : Aranýlan datanýn hangi indexte olduðunu söyler .
	//  sort() : Elimizdeki listeyi sýralayabiliriz .	
		
		
		isimler.add("Hamza");
		isimler.add("Gökhan");
		isimler.add("Ali");
		isimler.add(20);
		isimler.add(false);
		
		System.out.println(isimler);
		System.out.println(isimler.get(2));
		
		boolean varMi = isimler.contains("Hamza");
		System.out.println(varMi);
		
		isimler.remove(1);
		System.out.println(isimler);
		
		System.out.println(isimler.size());
		
		isimler.clear();
		
		System.out.println(isimler);

	}

}
