package javaDers33;

public class NesneIcindekiBilgileriDegistirme {

	public static void main(String[] args) {
		
		
		 
		Meyve nesne = new Meyve();
		
		System.out.println(nesne.adi);
		System.out.println(nesne.kalori);
		
		System.out.println("---------------------");
		
		Meyve nesne2 = new Meyve();
		
		nesne.adi = "armut" ;
		nesne.kalori = 400 ;
		
		System.out.println(nesne.adi);
		System.out.println(nesne.kalori);

	}

}
