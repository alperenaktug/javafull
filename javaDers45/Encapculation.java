package javaDers45;

public class Encapculation {

	public static void main(String[] args) {
		
		/*
		 encapsulation : Data saklama 
		 
		 D��ar�ya aktarmak istemedi�imiz de�i�keni
		 private yapar�z .
		 	 
		 */
		
		Ogretmen nesne = new Ogretmen();
				
		System.out.println(nesne.getBrans());
		System.out.println(nesne.getDogumTarihi());
	//	System.out.println(nesne.kimlikNo);

	}

}
