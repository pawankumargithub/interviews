package com.pawan.test;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		/*
		 * boolean isPalindrom = checkPalindrom(n); System.out.println(isPalindrom);
		 */
		boolean isStringPalindrome = isStrPalindrome(str);
		System.out.println(isStringPalindrome);

	}

	private static boolean isStrPalindrome(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev))
			return true;
		else
			return false;
	}

	private static boolean checkPalindrom(int n) {
		int rem = 0, sum = 0;
		int temp = n;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;

		}
		if (sum == n)

			return true;
		else
			return false;
	}

}
