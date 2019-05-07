package day02;

import java.util.Scanner;

public class Logical02Soal02 {

	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("input n1 : ");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("input n2 : ");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println("");
		int angka = 1;
		table(n1, angka);
		test(n2, angka);
	}

	public static void table(int t1, int t2) {
		for (int counter = 0; counter < t1; counter++) {
			System.out.print(counter + "\t");
		}
		System.out.println("");
		for (int counter1 = 1; counter1 <= t1; counter1++) {
			if (counter1 % 3 == 0) {
				int t3 = t2 * -1;
				t2 = t3 * -3;
				System.out.print(t3 + "\t");
			} else {
				System.out.print(t2 + "\t");
				t2 = t2 * 3;
			}
		}
	}

	public static void test(int a, int b) {
		int c = 1;
		int d = -1;
		System.out.println("");
		for (int counter = 0; counter < a; counter++) {
			if (counter < a - 1) {
				if (counter % 3 == 2) {
					c = c * (b*d);
					System.out.println(b + " * ");
					b= b*a;
				} else {
					c = c * b;
					System.out.print(b + " * ");
					b = b * a;
				}
			} else {
				if (counter % 3 == 2) {
					System.out.print(b + " = ");
					c = c * (b*d);
					System.out.print(c);
				} else {
					System.out.print(b + " = ");
					c = c * b;
					System.out.print(c);
				}
			}
		}

	}
}
