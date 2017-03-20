package com.ddb.javacore.datatype;

public class TestType {

	public static void main(String[] args) {
		double score = 98.55;
		String name = "三胖";
		char sex = '男';

		System.out.println("本次考试成绩最高分：" + score);
		System.out.println("最高分得主：" + name);
		System.out.println("性别：" + sex);

		/*
		 * int money; //声明一个变量
		 *  money = 1000;// 给变量赋值
		 */ 
		int money = 1000; // 声明并赋值

		// 使用变量
		System.out.println("变量money值为：" + money);
		// 改变变量的值，重复赋值
		money = 2500;
		System.out.println("改变money后的值为：" + money);

		// 常量
		final double PI = 3.1415926; // 声明一个double常量并赋值
		final String NAME = "JACK"; // 声明一个String类型的常量并赋值

		// 同时声明多个常量,以逗号分隔
		final char MALE = 'M', FEMALE = 'F';

		// 常量只能赋值一次
		final int num; // 声明一个常量
		num = 25; // 首次给常量赋值
		// System.out.println("num is :" + num);
		// num =36; //再次给常量赋值则不允许的！
		// System.out.println("change num is :" + num);
		
		//基本数据类型转换，大转小需要强制转换
		short price;
		price = (short) money;
		
		System.out.println("price is : " + price);
		
		short price2 = (short)236;
		//基本数据类型转换，小转大，直接自动转换
		long testlong;
		testlong = price2;
		System.out.println("testlong is :" + testlong);
		
	}

}
