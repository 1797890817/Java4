package com.ddb.javacore.array;

import static java.lang.System.out;

import java.util.Arrays;

public class ArrayDemo4 {

	//可变参数...
	public static void print(String... args2) {

		for (int j = 0; j < args2.length; j++) {
			out.println("args2[" + j + "] = " + args2[j]);
		}
	}

	public static void main(String[] args) {

		Student[] students = new Student[3];
		students[0] = new Student("zhangsan", 20);
		students[1] = new Student("lisi", 19);
		students[2] = new Student("wangwu", 22);
		out.println("students 原始值: ");
		for (Student student : students) {
			out.println(student);
		}

		Arrays.sort(students);
		out.println("students 排序后: ");
		for (Student student : students) {
			out.println(student);
		}

		// 二维数组
		out.println();
		out.println("towArrary Demo");
		int[][] towArrary = { { 9, 3 }, { 5, 4, 0, 5 }, { 9, 1, 2 } };
		out.println(towArrary[0][1]);
		out.println(towArrary[1][2]);
		out.println(towArrary[1][3]);
		towArrary[1][3] = 7;
		out.println(towArrary[1][3]);

		// main method args
		out.println("数组长度：" + args.length);
		out.println("args[0] = " + args[0]);
		out.println("args[1] = " + args[1]);
		/*
		 * out.println("args[2] = " + args[2]); out.println("args[3] = " +
		 * args[3]);
		 */
		System.out.println("一个参数");
		print("zhangsan");
		System.out.println("二个参数");
		print("zhangsan","china");
		System.out.println("三个参数");
		print("zhangsan","china","anhui");
	}

}
