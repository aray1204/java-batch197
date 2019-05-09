package day04;

public class Logic05Soal01 {

	public static void main(String[] args) {
		int namaVariable;
		
		Orang/*tipe data*/ org01/*objek*/ = new Orang()/*instansi*/;
		org01.id = 100000;
		org01.nama = "Arif";
		org01.alamat = "Depok";
		org01.jk = "Pria";
		org01.noTelp = "021-7782xxxx";
		
		System.out.println("ID \t\t"+org01.id);
		System.out.println("Nama \t\t"+org01.nama);
		System.out.println("Alamat \t\t"+org01.alamat);
		System.out.println("Jenis Kelamin \t"+org01.jk);
		System.out.println("Nomor Telpon \t"+org01.noTelp);
		
		Orang org02 = new Orang();
		org02.id = 100001;
		org02.nama = "Taufik";
		org02.alamat = "Depok";
		org02.jk = "Pria";
		org02.noTelp = "021-7782xxxx";
		
		org02.cetakData();
		
		Orang org03 = new Orang();
		
		
		Orang org04 = new Orang();
		Orang org05 = new Orang();
		Orang org06 = new Orang();
		Orang org07 = new Orang();
		Orang org08 = new Orang();
		Orang org09 = new Orang();
		Orang org10 = new Orang();
		Orang org11 = new Orang();
		
		int hasil = org04.perhitungan(3,4,5);
		System.out.println(hasil);
	}

}
