package javaDers36;

public class ParametreliConstructor {

	public static void main(String[] args) {
		
		Araba nesne = new Araba(200 , "Mavi");
		
		
		System.out.println(nesne.hiz);
		System.out.println(nesne.renk);
		
	   
		Araba nesne2 = new Araba(300 , "Mor");
		
		System.out.println(nesne2.hiz);
		System.out.println(nesne2.renk);

	}

}
