package javaDers56;

import java.util.ArrayList;

public class TipBelirleme {
	
/* <> i�aret i�erisinde liste i�erisinde tutmak istedi�imiz
 * veri tipini yazabiliriz . E�er ilkel veri tipi eklemek
 * istersek o zaman wrapper s�n�flar�  kullanmal�y�z .
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
