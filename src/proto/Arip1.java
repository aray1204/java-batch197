package proto;

public class Arip1 {

	public static void main(String[] args) {
		int n = 10;
		String[] nama = new String[n];
		String[] alamat = new String[n];
		String[] jk = new String[n];
		String[] noTelp = new String[n];
		Arip2 class2 = new Arip2();
		nama = class2.inputWarga(n);
		class2.tampilkanWarga(nama);

	}

}
