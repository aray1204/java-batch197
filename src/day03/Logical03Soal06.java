package day03;

import java.util.Scanner;

public class Logical03Soal06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan N :");
		int n = input.nextInt();
		System.out.println("Masukkan M : ");
		int m = input.nextInt();
//		System.out.println("Masukkan O : ");
//		int o = input.nextInt();
		deretAngka(n);
		int array[] = deretAngka(n);
		int array2[] = deretAngka(n);
		for(int i = 0; i <= m; i++ ) {
			for(int j = 0; j < n; j++) {
				System.out.print(array[j]+"\t");
			}
			System.out.println();
			
			for(int k = n-1; k >= 0; k--) {
				if(k==n-1) {
					array[k]=array2[0];
				}else {
					array[k]=array2[k+1];
				}
			}
			
			for(int l = 0; l < n; l++) {
				array2[l]=array[l];
			}
			
		}

	}

	static int[] deretAngka(int n) {
		int hasil[] = new int[n];
		int awal = 2;
		int tambah = 2;
		for (int i = 0; i < n; i++) {
			hasil[i]= awal;
			awal = awal + tambah;
			tambah+=2;
//			System.out.print(hasil[i] + "\t");
		}
		
		return hasil;
	}

}
