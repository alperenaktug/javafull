package javaDers14;

import java.util.Scanner;

public class Pratik01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Araban�z  var m� ?  (true/false) ");
		boolean araba = input.nextBoolean();
		
		
		System.out.println("Hava ya�murlu mu ?  (true/false)");
		boolean yagmur = input.nextBoolean();
		
		
		if (araba ) {
			
			if (yagmur) {
				
				System.out.println("�emsiyeye gerek yok ama ya�mur var ! ");
			}else {
				System.out.println("�emsiyeye gerek yok , ��nk� ya�mur ya�m�yor");
				
			}
			
				
		}else {
			
			if (yagmur) {
				System.out.println("�emsiyeye ihtiyac�n olacak");
			}else {
				System.out.println("�emsiyeye ihtiyac�n olmayacak");
			}
		}
		

	}

}
