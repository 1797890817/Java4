package com.ddb.javacore.ood5;

public class IDemoTest {

	public static void main(String[] args) {
		IStudent student = new StudentImpl();
		student.study();
		student.study("Java");
		student.study("PHP");
		student.study("Python");
		
	}

}
