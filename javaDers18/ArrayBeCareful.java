package javaDers18;

public class ArrayBeCareful {

	public static void main(String[] args) {
		
		// Array'de dikkat edilesi gerekenler
		// int javada default deðeri 0 
		// String in javada default deðeri null
		
		
		String [] isimler = new String[3];
		
		isimler[0] = "Alperen";
		isimler[1] = "Talip";
		isimler[2] = "Dilek";
		
		
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);
		System.out.println(isimler[2]);

	}

}
