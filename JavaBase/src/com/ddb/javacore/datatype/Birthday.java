package com.ddb.javacore.datatype;

public class Birthday {

	private int day;
	private int month;
	private int year;

	/*
	 * 值传递，参数为基本类型
	 * 
	 * @param year
	 * 
	 * @param month
	 * 
	 * @param day
	 */
	public void display(int year, int month, int day) {
		day = 11;
		month = 11;
		year = 2015;
		System.out.println("值传递方法中：" + year + "-" + month + "-" + day);
	}

	/*
	 * 引用传递
	 * 
	 * @param birthday
	 * 
	 */
	public void display(Birthday birthday) {
		birthday.day = 12;
		birthday.month = 12;
		birthday.year = 2016;
		System.out.println("引用传递方法中：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	}

	// 值传递测试
	public static void testValue1() {
		Birthday birthday = new Birthday();
		// 定义三个基本类型的变量，分别为日月年
		int day = 12, month = 12, year = 2016;
		// 传递之前打印三个变量的值
		System.out.println("传递之前：" + year + "-" + month + "-" + day);
		birthday.display(year, month, day);
		System.out.println("传递之后：" + year + "-" + month + "-" + day);
	}

	// 引用值传递测试
	public static void testValue2() {
		Birthday birthday = new Birthday();
		birthday.day = 3;
		birthday.month = 3;
		birthday.year = 2016;
		// 传递之前打印birthday的值
		System.out.println("传递之前：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
		birthday.display(birthday);
		// 传递之后再打印对象的值
		System.out.println("传递之后：" + birthday.year + "-" + birthday.month + "-" + birthday.day);

	}

	public static void main(String[] args) {
		testValue1();
		System.out.println("--------------------------------");
		testValue2();
	}

}
