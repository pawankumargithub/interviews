package com.pawan.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Employee> list = Employee.employeeList();
		Map<Integer, Employee> map = convertListToMap(list);
		map.forEach((k, v) -> {

			System.out.println(k + " " + v);
		});
	}

	private static Map<Integer, Employee> convertListToMap(List<Employee> list) {

		return list.stream().collect(Collectors.toMap(e -> e.getId(), e -> e));
	}
}
