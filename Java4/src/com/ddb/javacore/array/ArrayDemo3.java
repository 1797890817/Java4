package com.ddb.javacore.array;

import static java.lang.System.out;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] score;
		score = new int[] { 22, 44, 33, 55, 11 }; // 声明并分配空间及赋值，方式二 ,不能再指定大小

		out.println("数组的初始顺序：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}
		
		//foreach访问数组元素
		out.println("Foreach 输出：");
		for (int i : score) {
			//out.println("score[" + i + "] = " + score[i] + ";");
			out.println(i);	//i表示的是数组中的元素，而不是数组的索引！
		}
		
		// 数组排序
		Arrays.sort(score);
		out.println("数组的排序后顺序：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}
		
		//数组拷贝
		//int[] score2 =new int[5];
		int[] score2 =Arrays.copyOf(score,8);
		out.println("score2：");
		for (int i = 0; i < score2.length; i++) {
			out.println("score2[" + i + "] = " + score2[i] + ";");
		}
		
		int[] score3 = new int[5];
		out.println("score3原始：");
		for (int i = 0; i < score3.length; i++) {
			out.println("score3[" + i + "] = " + score3[i] + ";");
		}
		System.arraycopy(score, 0, score3, 0, 5);
		out.println("拷贝后score3：");
		for (int i = 0; i < score3.length; i++) {
			out.println("score3[" + i + "] = " + score3[i] + ";");
		}
		
		//修改score数组的值
		score3[0]=99;
		score3[2]=88;
		score3[3]=77;
		out.println("修改了score3数组，看score的值：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}
		for (int i = 0; i < score3.length; i++) {
			out.println("score3[" + i + "] = " + score3[i] + ";");
		}
		
		//深拷贝，浅拷贝
		Student[] students = new Student[3];
		students[0] = new Student("zhangsan",20);
		students[1] = new Student("lisi",21);
		students[2] = new Student("wangwu",22);
		out.println("students 原始值: ");
		for (Student student : students) {
			out.println(student);
		}
		
		Student[] students2 =new Student[3];
		System.arraycopy(students, 0, students2, 0, 3);	//浅拷贝
		//students2 = Arrays.copyOf(students, 3);
		out.println("students2 原始值: ");
		for (Student student : students2) {
			out.println(student);
		}
		
		out.println("修改students2的值...");
		students2[0].age=30;
		students2[1].age=31;
		students2[2].age=32;
		out.println("students2 修改后的值: ");
		for (Student student : students2) {
			out.println(student);
		}
		out.println("students的值: ");
		for (Student student : students) {
			out.println(student);
		}
		
	}

}
