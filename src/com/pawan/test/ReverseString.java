package com.pawan.test;

public class ReverseString {

	public static void main(String[] args) {

		int n = 0;

		int count=0;
		for (int i = 1; i <= n; i++) {
            if(n%i==0) {
            	count++;
            }
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}