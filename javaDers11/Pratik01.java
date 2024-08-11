package javaDers11;

import java.util.Scanner;

public class Pratik01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanýcý adýný giriniz : ");
		String username = input.next();
		
		System.out.println("Þifrenizi giriniz : ");
		String password = input.next();
		
		if (username.equals("alp")  && password.equals("1234") )
		{
			System.out.println("Kullanýcý adý ve þifreniz doðru baþarýyla giriþ yaptýnýz !!");
		}
		else
		{
			System.out.println("Kullanýcý adý yada þifreniz hatalý tekrar giriþ yapmayý deneyiniz !!");
		}
	}

}
