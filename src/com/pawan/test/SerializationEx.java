package com.pawan.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * Employee e = new Employee(1, "pawan", 12000); FileOutputStream fos = new
		 * FileOutputStream("employee.ser"); ObjectOutputStream oos = new
		 * ObjectOutputStream(fos); oos.writeObject(e); oos.close(); // desrialize
		 * 
		 * FileInputStream fis = new FileInputStream("employee.ser"); ObjectInputStream
		 * ois = new ObjectInputStream(fis); Employee employee = (Employee)
		 * ois.readObject(); System.out.println(employee);
		 */
		SingleToneEx ex1 = SingleToneEx.getSingleToneEx();
		SingleToneEx ex2 = SingleToneEx.getSingleToneEx();
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		

	}

}
