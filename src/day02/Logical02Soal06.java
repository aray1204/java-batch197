package day02;
import java.util.Scanner;
public class Logical02Soal06 {
	public static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("Input kalimat : ");
		Scanner scanner = new Scanner(System.in);
		String kalimat = scanner.nextLine();
		int upperCase = 0;
		for(int i=0; i<kalimat.length(); i++) {
			for (char c='A'; c<='Z';c++) {
				if (kalimat.charAt(i) == c) {
					upperCase++;
				}
			}
		}
		
		System.out.println(upperCase + "");
	}

}
