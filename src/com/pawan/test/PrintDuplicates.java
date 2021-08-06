package com.pawan.test;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int n = 151;
		// boolean flag=findArmstrongNumber(n);
		boolean isPalindrome = findPalindrome(n);
		System.out.println(isPalindrome);
		/*
		 * int arr[]= {2,3,4,2,4,6}; Set<Integer>list=new HashSet(); for (int i : arr) {
		 * 
		 * if(list.add(i)==false) { System.out.println(i); } }
		 */
	}

	private static boolean findPalindrome(int n) {

		boolean isPalindrome = false;
		int temp = n;
		int rem = 0, rev = 0;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
			if (n == rev)
				isPalindrome = true;
			else
				isPalindrome = false;

		}
		return isPalindrome;
	}

	public static boolean findArmstrongNumber(int n) {

		int temp = n;
		int sum = 0;
		int rem = 0;
		boolean flag = false;
		while (temp != 0) {
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;
			if (n == sum)
				flag = true;
			else
				flag = false;
		}
		return flag;
	}
}
