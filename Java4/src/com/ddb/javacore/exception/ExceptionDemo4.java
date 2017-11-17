package com.ddb.javacore.exception;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {

		try {
			div();
		} catch (ByZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

	public static int div() throws ByZeroException { // 声明方法会产生异常，多个值之间使用逗号分隔
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要算除法的两个数：");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if (num2 == 0) {
			throw new ByZeroException();
		}
		System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
		System.out.println("两个数相除为：" + num1 / num2);
		return 0;

	}

}
