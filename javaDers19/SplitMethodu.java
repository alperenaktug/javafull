package javaDers19;

public class SplitMethodu {

	public static void main(String[] args) {
		
		// string bir ifadeyi array e �eviriyor.
		
		String diller = "T�rk�e,ingilizce,almanca,frans�zca,japonca";
		
		String[] array = diller.split(",");
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println(array.length);
		
		
	}

}
