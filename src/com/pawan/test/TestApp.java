package com.pawan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestApp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");fruits.add("graphs");fruits.add("orange");
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(2);
		Map<Integer, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((k, v) -> {
			// System.out.println(k+" "+v);
		});
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		// System.out.println(list1);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		//System.out.println(list2);
		//fruits.stream().map(fruit->fruit.startsWith("d")).collect(Collectors.toList()).forEach(System.out::println);

	}
}
