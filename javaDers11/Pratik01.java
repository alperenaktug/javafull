package javaDers11;

import java.util.Scanner;

public class Pratik01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n� giriniz : ");
		String username = input.next();
		
		System.out.println("�ifrenizi giriniz : ");
		String password = input.next();
		
		if (username.equals("alp")  && password.equals("1234") )
		{
			System.out.println("Kullan�c� ad� ve �ifreniz do�ru ba�ar�yla giri� yapt�n�z !!");
		}
		else
		{
			System.out.println("Kullan�c� ad� yada �ifreniz hatal� tekrar giri� yapmay� deneyiniz !!");
		}
	}

}
