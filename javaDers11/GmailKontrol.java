package javaDers11;

import java.util.Scanner;

public class GmailKontrol {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("L�tfen bir email adresi yaz�n�z : ");	
		String email = input.next();
		
		int index  = email.indexOf("@");
		String gmail = email.substring(index + 1);
			
		
		if (! email.contains("@")) {
			System.out.println("@ i�areti olmadan bir email adresi ayazamazs�n�z ");		
		}
		if(gmail.equals("gmail.com") == false) {
			System.out.println("Gmail hesab�n�z� giriniz .");
		}

	}

}
