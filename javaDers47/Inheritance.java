package javaDers47;

public class Inheritance {
	
	// Inheritance : Kal�t�m (Miras alma)
	
	// extends kavram� kullan�larak miras al�n�r .

	public static void main(String[] args) {
		
		Ogretmen nesne = new Ogretmen();
		
		System.out.println(nesne.brans);
		System.out.println(nesne.isim);
		
		
		// Miras al�nan �zellikler
		System.out.println(nesne.bilgi);
		System.out.println(nesne.maas);
	    nesne.deneme();
	    
	    
	    Mudur nesne2 = new Mudur();
	    
	    System.out.println(nesne2.bilgi);
	    System.out.println(nesne2.maas);
	    nesne2.deneme();
	    
		

	}

}
