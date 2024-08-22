package javaDers56;

import java.util.ArrayList;

public class Main {
	/* ArrayList :
	 * Liste uzunlu�u dinamiktir .
	 * ��erisinde farkl� tipte datalar tutabilir.
	 * 
	 * */

	public static void main(String[] args) {
		
		ArrayList isimler = new ArrayList();
		
	// 	add() : Veri eklemek i�in
	//  get() : �stenilen indexten veri almak i�in	
	//  remove() : Verileri silmek i�in 
	//  size() : ArrayList de ka� tane data var s�yler.
	//  clear() : T�m elemanlar� listeden temizler .
	//  contains() : Herhangi bir datan�n listede olup olmad���n� s�yler
	//  indexOf() : Aran�lan datan�n hangi indexte oldu�unu s�yler .
	//  sort() : Elimizdeki listeyi s�ralayabiliriz .	
		
		
		isimler.add("Hamza");
		isimler.add("G�khan");
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
