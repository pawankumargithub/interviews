package com.pawan.test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 3, 5, 9, 4, 6, 90);
		
		for (int i =list.size()-1; i>0; i--) {
			System.out.println(list.get(i));
		}

	}
}
