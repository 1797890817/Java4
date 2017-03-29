package com.ddb.javacore.array;

import static java.lang.System.out;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// PrintStream out = System.out;
		// 声明数组
		int[] score;
		// 数组分配空间
		score = new int[5];
		// 给数组指定格子赋值
		score[0] = 65; // 给第一个元素位，赋值。下标从0开始
		score[1] = 60;
		score[2] = 75;
		score[3] = 55;
		score[4] = 80;
		// score[5]=66; //会导致数组越界异常

		// 使用数组中的元素，使用下标去取值
		out.println("逐个手写输出：");
		out.println("score[0] = " + score[0] + ";");
		out.println("score[1] = " + score[1] + ";");
		out.println("score[2] = " + score[2] + ";");
		out.println("score[3] = " + score[3] + ";");
		out.println("score[4] = " + score[4] + ";");

		// 使用循环取值并输出
		out.println("逐个循环输出：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}

		// 排序：
		Arrays.sort(score);
		out.println("排序后逐个循环输出：");
		for (int i = 0; i < score.length; i++) {
			out.println("score[" + i + "] = " + score[i] + ";");
		}
	}

}
