package day06;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

	// Complete the minimumNumber function below.
//	static int minimumNumber(int n, String password) {
//		int uppercaseCount = 0;
//		int lowercaseCount = 0;
//		int spesialCharCount = 0;
//		int num_count = 0;
//		int tba = 0;
//		for (int i = 0; i < n; i++) {
//			if (Character.isDigit(password.charAt(i)))
//				num_count++;
//			if (Character.isUpperCase(password.charAt(i)))
//				uppercaseCount++;
//			if (Character.isLowerCase(password.charAt(i)))
//				lowercaseCount++;
//			if (password.charAt(i) != 32 && (password.charAt(i) < 48 || password.charAt(i) > 57)
//					&& (password.charAt(i) < 65 || password.charAt(i) > 90)
//					&& (password.charAt(i) < 97 || password.charAt(i) > 122))
//				spesialCharCount++;
//		}
//
//		if (num_count == 0)
//			tba++;
//		if (uppercaseCount == 0)
//			tba++;
//		if (lowercaseCount == 0)
//			tba++;
//		if (spesialCharCount == 0)
//			tba++;
//
//		if (n + tba < 6) {
//			while (n + tba < 6)
//				tba++;
//		}
//		return tba;
//
//	}

	static int minimumNumber(int n, String password) {
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		char[] input = password.toCharArray();

		int count = 4;
		int ddoss = 6 - n;

		boolean num = true;
		boolean l = true;
		boolean u = true;
		boolean s = true;

		for (int i = 0; i < n; i++) {

			if (numbers.indexOf(input[i]) >= 0 && num) {
				count--;
				num = false;
			}

			if (lower_case.indexOf(input[i]) >= 0 && l) {
				count--;
				l = false;
			}
			if (upper_case.indexOf(input[i]) >= 0 && u) {
				count--;
				u = false;
			}
			if (special_characters.indexOf(input[i]) >= 0 && s) {
				count--;
				s = false;
			}

		}

		if (ddoss > count)
			return ddoss;
		else
			return count;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String password = scanner.nextLine();

		int answer = minimumNumber(n, password);

//		bufferedWriter.write(String.valueOf(answer));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
