package day03;

import java.util.Scanner;

public class Logical03Soal02 {
	public static Scanner input;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan N : ");
		int n = input.nextInt();
		System.out.println("Masukkan M : ");
		int m = input.nextInt();
		System.out.println("Masukkan O : ");
		int o = input.nextInt();

		int[] array = deretSegitiga((n * 3), m, o);
		int index = 0;
		int a = 0;

		int array2[][] = new int[n][n];

		// GaRing
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if(i+j==n-1) {
					array2[i][j] = array[index];
					j++;
					index++;
				}
			}
		}
		
		// Kanan
		for (int i= 1; i < n; i++) {
			array2[i][n-1]=array[index];
			index++;
		}
		
		// Bawah
		for (int i = n-2; i > 0; i--) {
			array2[6][i] = array[index];
			index++;
		}

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[] deretSegitiga(int n, int m, int o) {
		int hasil[] = new int[n];
		int angka = o;
		int kali = 1;
		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				hasil[i] = (m * kali);
				kali = hasil[i];
			} else {
				hasil[i] = angka;
				angka = angka + m;
			}
//			System.out.print(hasil[i]+" ");
		}
		return hasil;
	}

}
