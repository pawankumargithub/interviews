package com.pawan.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.sun.source.doctree.SerialDataTree;

public class App {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.employeeList();
		Map<String, Integer> map = Map.of("pawan", 1, "akash", 10, "rahul", 13);
		List<String> list = List.of("abcd", "pqrs", "wxyz", "abcd", "pqrs");
		/*
		 * List<String> employeesNames = employeeList.stream().map(Employee::getName)
		 * .collect(Collectors.toList()); employeesNames.forEach(System.out::println);
		 */
		/*
		 * List<Employee>sortedEmployees=employeeList.stream().sorted(Comparator.
		 * comparing(Employee::getName).thenComparing(Employee::getSal)).collect(
		 * Collectors.toList()); sortedEmployees.forEach(System.out::println);
		 */
		/*
		 * Map<Integer, List<Employee>>
		 * maps=employeeList.stream().collect(Collectors.groupingBy(Employee::getId));
		 * System.out.println(maps);
		 * 
		 * Map<Integer, String> maps =
		 * employeeList.stream().collect(Collectors.toMap(Employee::getId,
		 * Employee::getName)); System.out.println(maps);
		 */
		/*
		 * List<Entry<String, Integer>> list =
		 * map.entrySet().stream().collect(Collectors.toList());
		 * 
		 * for (Entry<String, Integer> entry : list) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		// System.out.println(list);
		/*
		 * Map<String, Long> map1 = list.stream()
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * System.out.println(map1);
		 */
 
	}

}

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public static List<Employee> employeeList() {
		return Arrays.asList(new Employee(2, "pawan", 122), new Employee(4, "rahul", 344),
				(new Employee(6, "akash", 144)));
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}