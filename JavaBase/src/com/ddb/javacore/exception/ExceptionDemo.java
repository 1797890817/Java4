package com.ddb.javacore.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// System.out.println(args[2]);// 没有给参数，数组越界异常
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要算除法的两个数：");

		try {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			System.out.println("两个数相除为：" + num1 / num2);
		} catch (InputMismatchException ime) {
			System.out.println("我捕捉到了InputMismatchException异常！");
			ime.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println("我捕捉到了ArithmeticException异常！");
			ae.printStackTrace();
		} catch (Exception e) {
			System.out.println("我捕捉到了异常！");
			System.out.println(e.getClass().getName());
			// e.printStackTrace();
		}
		System.out.println("程序执行到此处，已经结束了！");
		// java.lang.ArithmeticException: / by zero
		// java.util.InputMismatchException
	}

}
