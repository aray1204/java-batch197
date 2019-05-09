package proto;

import java.util.Scanner;

public class Arip2 {
	public static Scanner scan;

	public String[] inputWarga(Integer jumlahWarga) {
		scan = new Scanner(System.in);
		String[] namaWarga = new String[jumlahWarga];
		String[] alamatWarga = new String[jumlahWarga];
		String[] jkWarga = new String[jumlahWarga];
		String[] noTelpWarga = new String[jumlahWarga];
		for (int i = 0; i < jumlahWarga; i++) {
			System.out.println("Masukkan nama : ");
			namaWarga[i] = scan.next();
			System.out.println("Masukkan alamat :");
			alamatWarga[i] = scan.next();
			System.out.println("Masukkan jenis kelamin");
			jkWarga[i] = scan.next();
			System.out.println("Masukkan nomor telepon");
			noTelpWarga[i] = scan.next();
		}
		return namaWarga;
	}

	public void tampilkanWarga(String[] namaWarga) {
		for (int i = 0; i < namaWarga.length; i++) {
			System.out.println("Warga ke " + i+1 + " bernama "+namaWarga[i]);
		}
	}

}
