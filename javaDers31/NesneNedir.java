package javaDers31;

public class NesneNedir {

	public static void main(String[] args) {
		
		// java g�ndelik hayat� kopyalar , 
		// yapt���m�z i�lemleri ayr� ayr� class lara 
		// ay�rarak yapmak kod yaz�m�n� kolayla�t�r�r .
		
		//   ClassIsmi nesneIsmi = new ClassIsmi();
		
         Kitap nesne = new Kitap();
         Yazar nesne2 = new Yazar();  
       
         
         System.out.println(nesne.sayfa);
         System.out.println(nesne.yazar);
         
         System.out.println("-------------------");
         
         System.out.println(nesne2.id);
         System.out.println(nesne2.YazarAdi);
	}

}
