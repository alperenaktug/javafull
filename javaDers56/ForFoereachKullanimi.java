package javaDers56;

import java.util.ArrayList;

public class ForFoereachKullanimi {

	public static void main(String[] args) {
		
		
		ArrayList<String> isimler = new ArrayList<>();
		
		isimler.add("Hacý");
		isimler.add("Faruk");
		isimler.add("Kamil");
		isimler.add("Fatma");
		
		// eklenme sýrasýna göre 
		for(int i=0 ; i < isimler.size() ; i++) {
			System.out.print(isimler.get(i)
					 + "  ");
		}
		System.out.println();
		// ekleme sýrasýnýn tersine göre
		for(int i=isimler.size() - 1  ; i >= 0 ; i--) {
			System.out.print(isimler.get(i)
					 + "  ");
		}
		System.out.println();
		
		// foreach yardýmný ile
		
		for (String isim : isimler) {
			System.out.print(isim + "  ");
		}
		
		
		

	}

}
