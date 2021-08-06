package com.pawan.test;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedAndNonRepeated {

	public static void main(String[] args) {
		String str = "java";

		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {

			if (!map.containsKey(ch)) {

				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}

		for (char ch : str.toCharArray()) {
			if (map.get(ch) == 1) {
				System.out.println("first non-repeated char:"+ch);
				break;

			}

		}

		for (char ch : str.toCharArray()) {
			if (map.get(ch) > 1) {
				System.out.println("first repeated char:"+ch);
				break;
			}
		}

	}
}
