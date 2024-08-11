package javaDers22;

public class Pratik2 {

	public static void main(String[] args) {
		
		int [] array = { 10 , 20 , 30 , 40 ,60 , 70 ,80};
		
		int sira = 0;
		int uzunluk = array.length;
		int toplam = 0 ;
		
		while(sira < uzunluk) {
			
			toplam += array[sira];					
			sira++ ;
			
		}
		System.out.println("Toplam  : " + toplam);

	}

}
