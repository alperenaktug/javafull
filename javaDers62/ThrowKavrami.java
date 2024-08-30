package javaDers62;

public class ThrowKavrami {

	public static void main(String[] args) {
		
		
		int num1 = 30;
		int num2 = 0 ;
		
		try {
			
			if (num2 == 0 ) {
				throw new ArithmeticException();
			}else {
				System.out.println(num1/num2);
			}
			
		} catch (Exception e) {
			System.out.println("Hata yakalandý : " + e);
		}

	}

}
