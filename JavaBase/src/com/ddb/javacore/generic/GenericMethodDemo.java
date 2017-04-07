package com.ddb.javacore.generic;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethodDemo gmd = new GenericMethodDemo();
		String result1 = gmd.evaluate("AA", "AA");
		Integer result2 = gmd.evaluate(new Integer(365), new Integer(400));
		Integer result3 = gmd.evaluate(365, 365);
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);
	}

	//泛型方法
	public <T> T evaluate(T a, T b) {
		if (a.equals(b)) {
			return a;
		} else {
			return null;
		}
	}

}
