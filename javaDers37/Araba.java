package javaDers37;

public class Araba {
	
	
	public Araba() {
		this(200);
		System.out.println("default");
	}
	
	public Araba(int hiz) {
		this(200 , "Mavi");
		System.out.println("tekli");
	}
	
	public Araba(int hiz , String renk) {
		System.out.println("ikili");
	}

}
