package javaDers12;

import java.util.Scanner;

public class pratik01 {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("L�tfen ya��n�z� giriniz : ");
	    
	    int yas = input.nextInt();
	    
	    System.out.println("L�tfen cinsiyetinizi giriniz : ");
	    
	    String sex = input.next();
	    
	    if ( sex.equals("erkek")) {
	    	
	    	if ( yas >= 20) {
	    		
	    		System.out.println("Askere gidebilirsiniz");
	    	}else {
	    		System.out.println("Askere gidemezsiniz ");
	    	}
	    }

	}

}
