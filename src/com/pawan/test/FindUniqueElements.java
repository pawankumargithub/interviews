package com.pawan.test;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElements {

	public static void main(String[] args) {

		String s = "pabwan";

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		for (char ch : s.toCharArray()) {

			if (map.get(ch) == 1) {
				System.out.println(ch);
			}

		}
		System.out.println();
		for (char ch : s.toCharArray()) {

			if (map.get(ch) > 1) {
				System.out.println(ch);
			}

		}
	}
}
