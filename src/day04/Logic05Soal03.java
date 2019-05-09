package day04;

import java.util.Scanner;

//import proto.Orang;

public class Logic05Soal03 {
	public static Scanner input;
	public static int n;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println();
		System.out.println("Masukkan berapa data yg akan dimasukkan :");
		int jumlahInput = input.nextInt();

		n = jumlahInput;

		Manusia org = new Manusia();

		for (int i = 0; i < jumlahInput; i++) {
			System.out.println("Masukkan Input ID ke - "+(i+1));
			org.listId[i] = input.nextInt();
			
			System.out.println("Masukkan Nama :");
			org.listNama[i] = input.next();
			
			System.out.println("Masukkan Alamat :");
			org.listAlamat[i] = input.next();
			
			System.out.println("Masukkan Jenis Kelamin :");
			org.listJK[i] = input.next();
			
			System.out.println("Masukkan Nomor Telepon :");
			org.listNoTelp[i] = input.next();
			
		}
		
		System.out.println("=== DATA WARGA ===");
		for(int j = 0; j < n; j++) {
			System.out.println("\nData pribadi untuk input ke - " + (j + 1));
			System.out.println("ID \t\t: " + org.listId[j]);
			System.out.println("Nama \t\t: " + org.listNama[j]);
			System.out.println("Alamat \t\t: " + org.listAlamat[j]);
			System.out.println("Jenis Kelamin \t: " + org.listJK[j]);
			System.out.println("Nomor Telepon \t: " + org.listNoTelp[j]);
		}

	}

}
