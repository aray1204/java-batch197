package day04;
import java.util.Scanner;

public class Logical05Soal02 {
	public static Scanner input;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan jumlah data yg akan dimasukkan :");
		int n = input.nextInt();
		int id02 = 0;
		int[] id03 = new int[n];
		String[] nama03 = new String[n];
		String[] alamat03 = new String[n];
		String[] jk03 = new String[n];
		String[] noTelp03 = new String[n];
		System.out.println();
		System.out.println("***Mulai Masukkan Data***\n");
		for (int i = 0; i < n; i++) {
			System.out.println("data orang ke-"+(i+1));
//			id02++;
//			id03[i]=id02;
			System.out.print("Masukkan Nama :");
			String nama02	= input.next();
//			nama03[i]=nama02;
//			System.out.print("");
			System.out.print("Masukkan Alamat :");
			String alamat02	= input.next();
//			alamat03[i]=alamat02;
			System.out.print("Masukkan Jenis Kelamin :");
			String jk02		= input.next();
//			jk03[i]=jk02;
			System.out.print("Masukkan Nomor Telepon :");
			String noTelp02	= input.next();
//			noTelp03[i]=noTelp02;

			System.out.println();
		}
		
		System.out.println("==== DATA WARGA ====");
		for (int i = 0; i < n; i++) {
//			System.out.println("Data Warga ke-"+(i+1));
			System.out.println("ID \t = "+id03[i]);
			System.out.println("Nama \t = "+nama03[i]);
			System.out.println("Alamat \t = "+alamat03[i]);
			System.out.println("Jenis Kelamin \t = "+jk03[i]);
			System.out.println("Nomor Telepon \t = "+noTelp03[i]);
			System.out.println();
		}
//		for (int i = 0; i < args.length; i++) {
//			Orang org = new Orang();
//		}

	}

}
