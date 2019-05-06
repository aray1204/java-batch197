package day02;

public class MethodOverloadingExample4 {

	public static void main(String[] args) {
		int abc=jumlah(3,4);
		System.out.println("Hasil abc : "+abc);
		
		jumlah(3,4,5);
		

	}
	
	public static int jumlah (int a, int b) {
		return a + b;
	}
	
	public static void jumlah (int a, int b, int c) {
		System.out.println("Hasil : "+(a+b+c));
	}
	
	public static String namaLengkap(String namaDepan, String namaBelakang) {
		return namaDepan + " " + namaBelakang;
	}

}
