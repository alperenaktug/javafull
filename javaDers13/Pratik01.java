package javaDers13;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		System.out.println("L�tfen bug�n hangi g�n girer misniz :");
		
		String day = input.next();
		
		
		if (day.equals("pazar") || day.equals("cumartesi")) {
			
			System.out.println("Haftasonu");
		}else {
			System.out.println("Haftai�i");
		}

	}

}
