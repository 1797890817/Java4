package com.ddb.javacore.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class StandardStreamDemo {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("aa.txt"));
		System.setOut(new PrintStream("aaOut.txt"));

		Scanner scanner = new Scanner(System.in);
		String inputMsg = null;

		do {
			inputMsg = scanner.next(); // 遇到空格就停了
			// inputMsg = scanner.nextLine(); // 拷贝一行
			System.out.println(inputMsg);
		} while (scanner.hasNextLine());

		scanner.close();
		System.out.println("Copy Ok!");
	}

}
