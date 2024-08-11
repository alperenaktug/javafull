package javaDers7;

public class MainClass {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Aritmetik Operatörler
		int toplam = a + b; // 30
		int fark = a - b; // -10
		int carpim = a * b; // 200
		int bolum = a / b; // 0
		int kalan = a % b; // 10

		// Ýliþkisel Operatörler
		boolean esitMi = (a == b); // false
		boolean buyukMu = (a > b); // false
		boolean buyukEsitMi = (a >= b); // false
		boolean kucukMu = (a < b); // true
		boolean kucukEsitMi = (a <= b); // true
		boolean esitDeðilMi = (a != b); // true

		// Mantýksal Operatörler
		boolean sonuc = (a < b) && (a != b); // true

		// Atama Operatörleri
		a += b; // a = 30
		a -= b; // a = 10
        a *= b;  // a = 200
		// Artýrma ve Azaltma Operatörleri
		a++; // a = 11
		b--; // b = 19

		// Koþul Operatörü
		int c = (a > b) ? a : b; // c = 19
	}

}
