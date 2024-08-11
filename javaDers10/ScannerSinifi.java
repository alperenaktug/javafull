package javaDers10;

import java.util.Scanner;

public class ScannerSinifi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen bir adýnýzý giriniz : ");
		String name = input.nextLine();
		
		System.out.println("Lütfen soyadýnýzý giriniz : ");
		String lastName = input.nextLine();
		
		System.out.println( " Adýnýz  : " +  name +
				"\nSoyadýnýz : " + lastName);
		
		
		
		
		
		

	}

}
