package day03;

import java.util.Scanner;

public class Logical03Soal03 {
	public static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan N :");
		int n = input.nextInt();
		System.out.println("Masukkan M :");
		int m = input.nextInt();
		System.out.println("Masukkan O :");
		int o = input.nextInt();
		int array2[][] = new int[n][n];

//		deretTiga(n, m, o);
		int[] array = deretTiga((n * 4), m, o);
		int index = 0;
		
//		deret atas
		for (int i = 0; i < n; i++) {
			array2[0][i] = array[index];
			index++;
		}
		
//		deret kanan
		for (int i = 1; i < n; i++) {
			array2[i][n-1]=array[index];
			index++;
		}
		
//		deret bawah
		for(int i = n-2; i>=0;i--) {
			array2[6][i] = array[index];
			index++;
		}
		
//		deret kiri
		for(int i = n-2; i>0;i--) {
			array2[i][0]=array[index];
			index++;
		}
		
//		cetak deret
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
	}

//	deret angka
	static int[] deretTiga(int n, int m, int o) {
		int hasil[] = new int[n];
		int angka = o;
		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				hasil[i] = m;
			} else {
				hasil[i] = angka;
				angka += m;
			}
		}
		return hasil;
	}
}
