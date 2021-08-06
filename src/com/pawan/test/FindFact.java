package com.pawan.test;

public class FindFact {

	public static void main(String[] args) {
		
		int n=6;
		int fact=findFact(n);
		System.out.println(fact);
	}

	private static int findFact(int n) {
		
		int fact=1;
		for (int i =1; i <=n; i++) {
			fact=fact*i;
		}
		return fact;
	}
}
