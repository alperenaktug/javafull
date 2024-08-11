package javaDers28;

public class Pratik3 {

	public static void main(String[] args) {
	
		int[] sayilar = {10,20,30,40,50};
		int arananSayi = 50 ;
		
		kontrol(sayilar , arananSayi);
		
	}
	
	
	public static void kontrol(int[] array , int arananSayi) {
		boolean varMi = false;
		for (int sayi : array ) {
			
			if(sayi == arananSayi) {
				varMi = true;
				break;
			}
		}
		
		System.out.println("Var mı ? : " + varMi );
       
	}

}
