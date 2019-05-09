package day04;

import java.util.Scanner;

public class Test {

	public static Scanner input;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan berapa data yg akan dimasukkan :");
		int jumlahInput = input.nextInt();
		
		int n = jumlahInput;
		
		System.out.print("Masukkan Nama :");
		String nama	= input.next();
		System.out.print("Masukkan Alamat :");
		String alamat	= input.next();
		System.out.print("Masukkan Jenis Kelamin :");
		String jk	= input.next();
		System.out.print("Masukkan Nomor Telepon :");
		String noTelp	= input.next();
		
		Manusia coba = new Manusia();

	}

}
