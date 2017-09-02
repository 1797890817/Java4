package com.ddb.javacore.commonclasses;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		BigInteger bigInteger = new BigInteger("24");
		BigInteger bigInteger2 = new BigInteger("12");
		bigInteger.add(bigInteger2);
		System.out.println(bigInteger.add(bigInteger2).toString());
		System.out.println(bigInteger.divide(bigInteger2).toString());
		System.out.println(bigInteger.multiply(bigInteger2).toString());

	}

}
