package com.pawan.test;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2,1,3,2};
		// boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}
		}

	}

}
