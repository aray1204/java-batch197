package day03;

import java.util.Scanner;

public class Logical03Soal04 {

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
			
			for(int k = 0; k < n; k++) {
				if(k==0) {
					array[k]=array2[n-1];
				}else {
					array[k]=array2[k-1];
				}
			}
			
			for(int l = 0; l < n; l++) {
				array2[l]=array[l];
			}
			
		}

	}

	static int[] deretAngka(int n) {
		int hasil[] = new int[n];
		int awal = 1;
		int tambah = 2;
		for (int i = 0; i < n; i++) {
			hasil[i]= awal;
			awal = awal + tambah;
			tambah++;
//			System.out.print(hasil[i] + "\t");
		}
		
		return hasil;
	}

}
