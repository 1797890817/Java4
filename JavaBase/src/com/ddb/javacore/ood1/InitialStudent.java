package com.ddb.javacore.ood1;

public class InitialStudent {
	public static void main(String args[]) {
		Student student = new Student();
		student.name = "张浩";
		student.age = 10;
		student.classNo = "S1班";
		student.hobby = "篮球";
		student.show();
	}
}
