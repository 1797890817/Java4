package com.ddb.javacore.operator;

import java.io.PrintStream;

public class DataTypeDemo2 {

	public static void main(String[] args) {
		PrintStream prt = System.out;
		// char
		prt.println();
		prt.println("char demo:");
		char m, n = 'c';
		m = 'a';
		prt.println("m + n = " + (m + n) + ";");
		prt.println("m = " + m + ";");
		prt.println("n = " + n + ";");

		// float
		float i, j = (float) 3.0;
		i = 6;
		prt.println("float demo :");
		prt.println("i + j =" + (i + j) + ";");

		// String
		prt.println();
		prt.println("String demo :");
		String c, d = "Hello World!";
		c = "I love ";
		prt.println("c + d : " + c + d);
		prt.println("m + n = " + String.valueOf(m) + String.valueOf(n));
	}

}
