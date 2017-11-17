package com.ddb.javacore.array;

import static java.lang.System.out;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// PrintStream out = System.out;
		// 声明数组
		// int[] score; //方式一
		// int score[]; //方式二

		// 数组分配空间
		// score = new int[5];

		// int[] score = new int[5]; //声明并分配空间

		// int[] score ={2,2,3,5,1}; //声明并分配空间及赋值，方式一
		/*
		 * int[] score; score={2,2,3,5,1}; //声明并分配空间及赋值，这种写法不允许！
		 */

		// int[] score = new int[]{2,2,3,5,1}; //声明并分配空间及赋值，方式二 ,不能再指定大小
		int[] score;
		score = new int[] { 2, 2, 3, 5, 1 }; // 声明并分配空间及赋值，方式二 ,不能再指定大小
		
		/*int[] score =new int[5];
		score = { 2, 2, 3, 5, 1 }; // 声明并分配空间及赋值，方式二 ,不能再指定大小 ,这种写法也是不允许的！
*/
		
		
		// Scanner input = new Scanner(System.in);
		/*
		 * out.println("请输入数组的5个元素值："); for (int i = 0; i < score.length; i++) {
		 * score[i] = input.nextInt(); }
		 */

		// 使用循环取值并输出
		out.println("逐个循环输出：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}

		// 求平均数
		double avg = 0.0;

		// 逐个相加求平均数
		avg = (double) (score[0] + score[1] + score[2] + score[3] + score[4]) / score.length;
		out.println("平均数:" + avg);

		// 使用循环来求平均数
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			//sum = sum + score[i];
			sum += score[i];
		}
		out.println("总和：" + sum);
		out.println("使用循环求得的平均数：" + (double) sum / score.length);

	}

}
