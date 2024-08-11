package javaDers31;

public class NesneNedir {

	public static void main(String[] args) {
		
		// java gündelik hayatý kopyalar , 
		// yaptýðýmýz iþlemleri ayrý ayrý class lara 
		// ayýrarak yapmak kod yazýmýný kolaylaþtýrýr .
		
		//   ClassIsmi nesneIsmi = new ClassIsmi();
		
         Kitap nesne = new Kitap();
         Yazar nesne2 = new Yazar();  
       
         
         System.out.println(nesne.sayfa);
         System.out.println(nesne.yazar);
         
         System.out.println("-------------------");
         
         System.out.println(nesne2.id);
         System.out.println(nesne2.YazarAdi);
	}

}
