package javaDers49;

public class Abstraction {
	
	// Abstract class lardan nesne olu�turamazs�n .
	// Bu classlar extend edilmek i�in kullan�l�r .
	// Abstract calsslarda hem normal hemde abstract
	// metot olabilir . Abstract metoodlar g�vdesiz
	// metodlard�r ve kullan�rlen override etmemiz 
	// gereklidir .
	
	
	public static void main(String[] args) {
		
		 Kus nesne1 = new Kus();	 
	// 	 Canli nesne2 = new Canli(); Abstract class dan nesne olu�turulmaz !!!
		 
		 Canli nesne3 = new Kus();
		 
		 nesne1.konus();
		 nesne1.solunum();
		

	}

}
