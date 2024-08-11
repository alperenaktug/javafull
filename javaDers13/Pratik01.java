package javaDers13;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Lütfen bugün hangi gün girer misniz :");
		
		String day = input.next();
		
		
		if (day.equals("pazar") || day.equals("cumartesi")) {
			
			System.out.println("Haftasonu");
		}else {
			System.out.println("Haftaiçi");
		}

	}

}
