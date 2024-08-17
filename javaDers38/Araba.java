package javaDers38;

public class Araba {
	
	int arabaninHizi ;
	String arabaninRengi;
	
	
	public Araba( ) {
		this(150,"siyah");
		
		System.out.println("Default");
	}
	
	public Araba(int hiz) {
		this();
		System.out.println("tekli");
	}
	
	public Araba(int hiz , String renk) {
		arabaninHizi = hiz ;
		arabaninRengi = renk;
		System.out.println("ikili");
	}

}
