package javaDers10;

import java.util.Scanner;

public class ScannerSinifi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("L�tfen bir ad�n�z� giriniz : ");
		String name = input.nextLine();
		
		System.out.println("L�tfen soyad�n�z� giriniz : ");
		String lastName = input.nextLine();
		
		System.out.println( " Ad�n�z  : " +  name +
				"\nSoyad�n�z : " + lastName);
		
		
		
		
		
		

	}

}
