package com.ddb.javacore.exception;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class ExceptionDemo3 {
	private static Logger logger = Logger.getLogger(ExceptionDemo3.class);

	public static void main(String[] args) {

		/*int ret = 5;
		try {
			ret = div();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("返回的结果是：" + ret);*/

		try {
			exThrow(-5);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			logger.error(e.getMessage());
		}
		
		
	
	}

	public static int div() throws Exception { // 声明方法会产生异常，多个值之间使用逗号分隔
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要算除法的两个数：");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("两个数相除为：" + num1 / num2);
		return 0;

	}

	public static void exThrow(int age) throws Exception {

		// 如果age
		if (age < 0) {
			throw new Exception("age 不能小于0！！");
			//throw new ByZeroException();
		} else {
			System.out.println("age = " + age);
		}

	}

}
