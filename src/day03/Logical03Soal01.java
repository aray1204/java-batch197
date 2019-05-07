package day03;
import java.util.Scanner;
public class Logical03Soal01 {
	public static Scanner input;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input N :");
		int n = input.nextInt();
		int arr[][] = new int[n][n];
		int deret1[] = new int[n];
		int awal = 1;
		for (int i = 0; i < deret1.length; i++) {
			deret1[i] = awal;
			awal = awal + (i+2);
//			System.out.print(deret1[i]+"\t");
		}
		System.out.println();
		int deret2[] = new int[n];
		int awal2 = 2;
		for (int i = 0; i < deret2.length; i++) {
			deret2[i]=awal2;
			awal2=awal2+(2*(i+1));
//			System.out.print(deret2[i]+"\t");
		}
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(i == j) {
					arr[i][j]=deret1[i];
				}else if(i+j==n-1){
					arr[i][j]=deret2[j];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
