package javaDers14;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Arabanýz  var mý ?  (true/false) ");
		boolean araba = input.nextBoolean();
		
		
		System.out.println("Hava yaðmurlu mu ?  (true/false)");
		boolean yagmur = input.nextBoolean();
		
		
		if (araba ) {
			
			if (yagmur) {
				
				System.out.println("Þemsiyeye gerek yok ama yaðmur var ! ");
			}else {
				System.out.println("þemsiyeye gerek yok , çünkü yaðmur yaðmýyor");
				
			}
			
				
		}else {
			
			if (yagmur) {
				System.out.println("Þemsiyeye ihtiyacýn olacak");
			}else {
				System.out.println("þemsiyeye ihtiyacýn olmayacak");
			}
		}
		

	}

}
