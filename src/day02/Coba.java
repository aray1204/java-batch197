package day02;
import java.util.Scanner;
public class Coba {
	public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan N1 :");
		int n1 = input.nextInt();
		System.out.println("Masukkan N2 :");
		int n2 = input.nextInt();
		System.out.println("Masukkan N3 :");
		int n3 = input.nextInt();
		int deret[] = new int[n1];
		for (int i = 0; i < n1; i++) {
			if(i<n1/2) {
				deret[i]=n2;
				n2=n2*n3;
			}else {
				deret[i]=n2;
				n2=n2/n3;
			}
			System.out.print(deret[i]+"\t");
		}
		
		System.out.println("");
		System.out.print("perhitungan " + deret[n1/2]);
		int hasil = deret[n1/2];
		for (int a=n1/2+1;a < n1/2+3;a++) {
			hasil = hasil-deret[a];
			System.out.print(" - "+deret[a]);
		}System.out.println(" = "+hasil);
	}

}
