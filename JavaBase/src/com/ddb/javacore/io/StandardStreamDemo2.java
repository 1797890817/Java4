package com.ddb.javacore.io;

import java.util.Scanner;

public class StandardStreamDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputMsg = null;

		do {
			System.out.println("请输入提示信息：");
			inputMsg = scanner.next();
			if (!inputMsg.equals("quit")) {
				System.err.println("您输入的是：" + inputMsg);
			}
		} while (!inputMsg.equals("quit"));

		scanner.close();
	}

}
