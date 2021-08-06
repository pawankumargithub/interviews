package com.pawan.test;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 1, 4, 5 };
		int ele = 20;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {

			if (ele == arr[i]) {
				index = i;
				// System.out.println(index);
				break;
			}

		}

		if (index != -1) {
			for (int i = index; i < arr.length - 1; i++) {

				arr[i] = arr[i + 1];

			}
			for (int i = 0; i < arr.length - 1; i++) {

				System.out.println(arr[i]);

			}
		}

	}
}
