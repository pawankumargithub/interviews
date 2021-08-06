package com.pawan.test;

public class ShiftUpperCaseToRighgt {

	public static void main(String[] args) {

		String str = "PAbGwaN";

		String result = shiftUpperCase(str);
		System.out.println(result);

	}

	private static String shiftUpperCase(String str) {
		String upper = "", lower = "";
		char ch = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper = upper + ch;
			} else {
				lower = lower + ch;
			}
		}
		return lower + upper;
	}

}
