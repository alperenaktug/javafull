package javaDers16;

public class SwitchCaseKullanimi {

	public static void main(String[] args) {
		
		
		int gun = 9 ;
		
		switch (gun) {
		
             case 1: System.out.println("monday"); 
		     break;
		     
             case 2 : System.out.println("tuesday");
             break;
             
             case 3 : System.out.println("wednesday");
             break ;
             
             case 4 : System.out.println("thursday");
             break ;
             
             case 5 : System.out.println("friday");
             break ;
             
             case 6 : System.out.println("saturday");
             break ;
             
             case 7 : System.out.println("sunday");
             break ;
             
             default : System.out.println("L�tfen ge�erli bir say� giriniz !!");
             
             
             // if else den fark� switch case ihtimallerin belirli ol
             // du�u durumlarda kullan�l�r .
		}
		
		
	}

}
