package javaDers56;

import java.util.ArrayList;

public class TipBelirleme {
	
/* <> iþaret içerisinde liste içerisinde tutmak istediðimiz
 * veri tipini yazabiliriz . Eðer ilkel veri tipi eklemek
 * istersek o zaman wrapper sýnýflarý  kullanmalýyýz .
 * */	

	public static void main(String[] args) {
		
		ArrayList<String> isimler = new ArrayList<>();
		
		isimler.add("Kerem");
		isimler.add("Mustafa");
		
	// 	isimler(20);
		
		System.out.println(isimler);
		
		
		ArrayList<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(4);
		sayilar.add(5);
		sayilar.add(6);
		
		System.out.println(sayilar);


	}

}
