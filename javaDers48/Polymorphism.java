package javaDers48;

public class Polymorphism {
	/*
 	Polymorphism = Kal�t�mda �ncelik(�ok bi�imlilik) :
 	
 	Bir nesnenin birden fazla farkl� nesneymi� gibi
    davranabilmesi .
 	
    */
	public static void main(String[] args) {
		
		
		Animal hayvan1 = new Animal();
		hayvan1.konus();
		
		Cat kedi = new Cat();
		kedi.konus();
		
		Dog kopek = new Dog();
		kopek.konus();
		
		Horse at = new Horse();
		at.konus();
		
		
		

	}

}
