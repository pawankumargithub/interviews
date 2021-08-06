package com.pawan.test;

import java.io.Serializable;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	

	
}
