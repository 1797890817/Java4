package com.ddb.javacore.branch;

import java.util.Scanner;

public class PrintTriangle {

	public static void printStars(Integer lgth,int hight) {
		int tmp= hight -lgth;
		lgth--;
		if (lgth < 0) {
			return;
		}
		int min = hight - tmp;	//可以加数值实现整体移动
		int max = hight + tmp;	//可以加数值实现整体移动
		for (int i = 1; i <= hight*2+1; i++) {
			if (i >= min && i <= max) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println("\n");
		printStars(lgth, hight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三角形的高：");
		Scanner input = new Scanner(System.in);
		int hight = input.nextInt();
		int length = hight * 2 + 1;
		System.out.println("三角形的底边长是：" +length);
		Integer lgth = hight;		
		printStars(lgth, hight);
	}
}
