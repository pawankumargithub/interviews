package com.pawan.test;

import java.util.HashSet;
import java.util.Set;

public class FindArm {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,4,1,3};
		Set<Integer>set=new HashSet<>();
		for (Integer ele : arr) {
			
			if(set.add(ele)==false) {
				System.out.println(ele);
			}
		}
	}
}
