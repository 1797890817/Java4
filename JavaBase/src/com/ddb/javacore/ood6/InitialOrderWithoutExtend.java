package com.ddb.javacore.ood6;

//【深入理解JVM】：Java类继承关系中的初始化顺序 - smile4lee的博客 - 博客频道 - CSDN.NET  
// http://blog.csdn.net/u011080472/article/details/51330114
public class InitialOrderWithoutExtend {
	SampleClass sam1 = new SampleClass("普通成员sam1初始化");
	static SampleClass sam = new SampleClass("静态成员sam初始化");
	static {
		System.out.println("static块执行");
		if (sam == null)
			System.out.println("sam is null");
		sam = new SampleClass("静态块内初始化sam成员变量");
	}
	SampleClass sam2 = new SampleClass("普通成员sam2初始化");


	InitialOrderWithoutExtend() {
		System.out.println("InitialOrderWithoutExtend默认构造函数被调用");
	}

	public static void main(String[] args) {
		// 创建第1个主类对象
		System.out.println("第1个主类对象：");
		InitialOrderWithoutExtend ts = new InitialOrderWithoutExtend();

		// 创建第2个主类对象
		System.out.println("第2个主类对象：");
		InitialOrderWithoutExtend ts2 = new InitialOrderWithoutExtend();

		// 查看两个主类对象的静态成员：
		System.out.println("2个主类对象的静态对象：");
		System.out.println("第1个主类对象, 静态成员sam.s: " + ts.sam);
		System.out.println("第2个主类对象, 静态成员sam.s: " + ts2.sam);
	}
}

class SampleClass {
	// SampleClass 不能包含任何主类InitialOrderWithoutExtend的成员变量
	// 否则导致循环引用，循环初始化，调用栈深度过大
	// 抛出 StackOverFlow 异常
	// static InitialOrderWithoutExtend iniClass1 = new
	// InitialOrderWithoutExtend("静态成员iniClass1初始化");
	// InitialOrderWithoutExtend iniClass2 = new
	// InitialOrderWithoutExtend("普通成员成员iniClass2初始化");

	String s;

	SampleClass(String s) {
		this.s = s;
		System.out.println(s);
	}

	SampleClass() {
		System.out.println("SampleClass默认构造函数被调用");
	}

	@Override
	public String toString() {
		return this.s;
	}
}