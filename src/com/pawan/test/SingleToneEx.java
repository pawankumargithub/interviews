package com.pawan.test;

public class SingleToneEx {

	private static SingleToneEx ex = null;

	private SingleToneEx() {
		// TODO Auto-generated constructor stub
	}

	public static SingleToneEx getSingleToneEx() {

		if (ex == null) {
			synchronized (SingleToneEx.class) {
				if (ex == null) {
					ex = new SingleToneEx();
				}
			}
		}
		return ex;
	}
}
