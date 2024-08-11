package javaDers11;

import java.util.Scanner;

public class GmailKontrol {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Lütfen bir email adresi yazýnýz : ");	
		String email = input.next();
		
		int index  = email.indexOf("@");
		String gmail = email.substring(index + 1);
			
		
		if (! email.contains("@")) {
			System.out.println("@ iþareti olmadan bir email adresi ayazamazsýnýz ");		
		}
		if(gmail.equals("gmail.com") == false) {
			System.out.println("Gmail hesabýnýzý giriniz .");
		}

	}

}
