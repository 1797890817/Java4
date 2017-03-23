package com.ddb.javacore.branch;

import java.io.PrintStream;
import java.util.Scanner;

public class LoopDemo2 {

	public static void forDemo(int num) {
		System.out.println("In forDemo mrethod: ");
		for (int i = 0; i <= num; i++) {
			if (i == 3) {
				// continue;
				// break;
				return;
			}
			System.out.println("大话设计模式这本书真好！ ---" + i);
		}
		System.out.println("forDemo mrethod End....");

	}

	public static void forDemo2(int num) {
		System.out.println("In forDemo mrethod: ");
		for (int i = 0; i <= num; i++) {
			System.out.println("嵌套循环的外循环 ---" + i);
			for (int j = 15; j > num; j--) {
				if (j==13){
					//break;
					return;
				}
				System.out.println("嵌套循环的内循环 ---" +j );
			}
		}
		System.out.println("forDemo mrethod End....");

	}

	public static void whileDemo(int num) {
		System.out.println("In whileDemo mrethod: ");
		int j = 0;
		while (j < num) {
			System.out.println("大话设计模式这本书真好！");
			j++;
		}
	}

	public static void doWhileDemo(int num) {
		System.out.println("In doWhileDemo mrethod: ");
		int i = 0;
		do {
			System.out.println("Java编程思想这本书真好！");
			i++;
		} while (i < num);
	}

	public static void forEachDemo() {
		System.out.println("In forEachDemo mrethod: ");
		String[] strs = { "AA", "BB", "CC" };
		for (String string : strs) {
			System.out.println("数组的元素为：" + string);
		}
	}
	public static void forEachDemo2() {
		System.out.println("In forEachDemo mrethod: ");
		String[] strs = { "AA", "BB", "CC" };
		for (String string : strs) {
			System.out.println("数组的元素为：" + string);
		}
	}

	public static void forMutiV(){
		PrintStream out = System.out;
		out.println("For muti-v demo: ");
		//for (int i = 1,j=9; (i <= 9)&&(j<=9); i++,j--) {
		for (int i = 1,j=20; i <= 9; i++,j-=2) {
			out.print(j+ " * "+ i +" = " + i * j + "\t");
		}
		out.println(); 
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		// for loop
		forDemo2(num);*/

		/*
		 * // while loop whileDemo(num);
		 * 
		 * // do while doWhileDemo(num);
		 * 
		 * // foreach loop forEachDemo();
		 */
		
		forMutiV();
	}

}
