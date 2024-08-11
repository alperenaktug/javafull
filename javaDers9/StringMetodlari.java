package javaDers9;

public class StringMetodlari {

	public static void main(String[] args) {
		/*
		 String Methods :
		 
		1-lenght()
		2-concat()
		3-indexof()
		4-equals()
		5-toLowerCase()
		6-toUpperCase()
		7-contains()	
		8-trim()
		9-charAt()
		10-split()
		11-compareTo()
		12-replace()
		13-substring()
		
		*/
		
		
		// length() :
		
		
		String uzunluk = "Cumhuriyet";
		String uzunluk2 = "Ýmparatorluk";
		
		System.out.println(uzunluk.length());
		System.out.println(uzunluk2.length());
		
		
		
		// concat() : 
		
		
		String isim = "Kerem" ;
		String soyad = "Kartal";
		
		String adSoyad = isim + soyad ;
		String bosluk  = isim.concat(" " + soyad);
		
		System.out.println(adSoyad);
		System.out.println(bosluk);
		
		
		
		// indexOf() :
		
		
		String isim3 = "Cumhuriyet";
		System.out.println("h harfinin bulunduðu index : " + isim3.indexOf("h"));
		
		
		
		// equals() :
		
		
		String name = "whatever";
		String name2 = "Whatever2" ;
		
		boolean result = name.equals(name2);
		
		System.out.println(result);
		
		
		
		// toLowerCase() : 
		
		
		String car = "SKODA";
		
		System.out.println(car.toLowerCase());
		
		
		
		// toUpperCase() : 
		
		
		String car2 = "mercedes" ;
		
		System.out.println(car2.toUpperCase());
		
		
		
		
		// contains() : 
		
		
		String notebook = "macbook" ;
		
		boolean result23 = notebook.contains("book");
		
		
		System.out.println(result23);
		
		
		
		// trim() :
		
		
		String name34 = "    Mobile Legends Pro League    ";
		
		System.out.println(name34.trim());
		
		
		
		
		// charAt() : 
		
		
		String butter = "Benimkimim";
		
		System.out.println(butter.charAt(4));
		
		
		
		// compareTo() : 
		
		
		String fut = "gs" ;
		String fut2 = "gs";
		
	    System.out.println(fut.compareTo(fut2));
		
		
		// replace() : 
	    
	    
	    String vol = "Merhaba ben javayý sevmiyorum";
	    
	    System.out.println(vol.replace("ben" , "sen"));
	    
	    
		
	    // substring() : 
	    
	    
	    // ilk yazýlan dahil son yazýlan dahil deðildir.
	    
	    String article = "Bilgi kendini bilmektir gerçek bilgelik ne bildiðini bilmektir ";
	    
	    System.out.println(article.substring(12,23));
	    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
