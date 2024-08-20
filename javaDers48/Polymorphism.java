package javaDers48;

public class Polymorphism {
	/*
 	Polymorphism = Kalýtýmda öncelik(çok biçimlilik) :
 	
 	Bir nesnenin birden fazla farklý nesneymiþ gibi
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
