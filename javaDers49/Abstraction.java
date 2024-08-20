package javaDers49;

public class Abstraction {
	
	// Abstract class lardan nesne oluþturamazsýn .
	// Bu classlar extend edilmek için kullanýlýr .
	// Abstract calsslarda hem normal hemde abstract
	// metot olabilir . Abstract metoodlar gövdesiz
	// metodlardýr ve kullanýrlen override etmemiz 
	// gereklidir .
	
	
	public static void main(String[] args) {
		
		 Kus nesne1 = new Kus();	 
	// 	 Canli nesne2 = new Canli(); Abstract class dan nesne oluþturulmaz !!!
		 
		 Canli nesne3 = new Kus();
		 
		 nesne1.konus();
		 nesne1.solunum();
		

	}

}
