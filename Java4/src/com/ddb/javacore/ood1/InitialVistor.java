package com.ddb.javacore.ood1;

import java.util.Scanner;

public class InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();
		System.out.print("请输入姓名：");
		v.name = input.next();
		System.out.print("请输入年龄：");
		v.age = input.nextInt();
		v.show();
	}
}
