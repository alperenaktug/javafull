package javaDers45;

public class Encapculation {

	public static void main(String[] args) {
		
		/*
		 encapsulation : Data saklama 
		 
		 Dýþarýya aktarmak istemediðimiz deðiþkeni
		 private yaparýz .
		 	 
		 */
		
		Ogretmen nesne = new Ogretmen();
				
		System.out.println(nesne.getBrans());
		System.out.println(nesne.getDogumTarihi());
	//	System.out.println(nesne.kimlikNo);

	}

}
