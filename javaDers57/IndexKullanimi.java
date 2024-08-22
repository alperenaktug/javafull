package javaDers57;

import java.util.LinkedList;

public class IndexKullanimi {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(0, 50); // index bilgisi eklendi
		
		System.out.println(numbers);
		

	}

}
