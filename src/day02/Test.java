package day02;
import java.util.Scanner;
public class Test {
	public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		//input deret
		System.out.println("Masukkan N1 :");
		int n1 = input.nextInt();
		//input awalan
		System.out.println("Masukkan N2 :");
		int n2 = input.nextInt();
		//input perkalian
		System.out.println("Masukkan N3 : ");
		int n3 = input.nextInt();
		
		int tengah = n1/2;
		int deret[] = new int[n1];
		//menampilkan output deret angka
		for(int i = 0; i < n1; i++) {
			if(i < tengah) {
				deret[i]=n2;
				n2=n2*2;
			}else {
				deret[i]=n2;
				n2=n2/2;
			}
			System.out.print(deret[i]+"\t");
		}
		System.out.println();
		System.out.println("perhitungan " +deret[tengah]);
//		for(int a = tengah+1; a < n)
	}

}
