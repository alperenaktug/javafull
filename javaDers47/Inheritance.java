package javaDers47;

public class Inheritance {
	
	// Inheritance : Kalıtım (Miras alma)
	
	// extends kavramı kullanılarak miras alınır .

	public static void main(String[] args) {
		
		Ogretmen nesne = new Ogretmen();
		
		System.out.println(nesne.brans);
		System.out.println(nesne.isim);
		
		
		// Miras alınan özellikler
		System.out.println(nesne.bilgi);
		System.out.println(nesne.maas);
	    nesne.deneme();
	    
	    
	    Mudur nesne2 = new Mudur();
	    
	    System.out.println(nesne2.bilgi);
	    System.out.println(nesne2.maas);
	    nesne2.deneme();
	    
		

	}

}
