package javaDers7;

public class MainClass {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// Aritmetik Operat�rler
		int toplam = a + b; // 30
		int fark = a - b; // -10
		int carpim = a * b; // 200
		int bolum = a / b; // 0
		int kalan = a % b; // 10

		// �li�kisel Operat�rler
		boolean esitMi = (a == b); // false
		boolean buyukMu = (a > b); // false
		boolean buyukEsitMi = (a >= b); // false
		boolean kucukMu = (a < b); // true
		boolean kucukEsitMi = (a <= b); // true
		boolean esitDe�ilMi = (a != b); // true

		// Mant�ksal Operat�rler
		boolean sonuc = (a < b) && (a != b); // true

		// Atama Operat�rleri
		a += b; // a = 30
		a -= b; // a = 10
        a *= b;  // a = 200
		// Art�rma ve Azaltma Operat�rleri
		a++; // a = 11
		b--; // b = 19

		// Ko�ul Operat�r�
		int c = (a > b) ? a : b; // c = 19
	}

}
