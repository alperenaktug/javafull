package javaDers56;

import java.util.ArrayList;

public class ForFoereachKullanimi {

	public static void main(String[] args) {
		
		
		ArrayList<String> isimler = new ArrayList<>();
		
		isimler.add("Hac�");
		isimler.add("Faruk");
		isimler.add("Kamil");
		isimler.add("Fatma");
		
		// eklenme s�ras�na g�re 
		for(int i=0 ; i < isimler.size() ; i++) {
			System.out.print(isimler.get(i)
					 + "  ");
		}
		System.out.println();
		// ekleme s�ras�n�n tersine g�re
		for(int i=isimler.size() - 1  ; i >= 0 ; i--) {
			System.out.print(isimler.get(i)
					 + "  ");
		}
		System.out.println();
		
		// foreach yard�mn� ile
		
		for (String isim : isimler) {
			System.out.print(isim + "  ");
		}
		
		
		

	}

}
