package com.ddb.javacore.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(); // 使用原始类型
		list.add(new Student("ID001", 20));
		list.add(new Student("ID002", 25));
		list.add(new Student("ID003", 19));
		list.add(new Student("ID004", 15));
		list.add(new Student("ID005", 30));

		System.out.println("list 排序前:" + list);
		// 排序
		// Arrays //对数组排序
		Collections.sort(list);	//自动调用Student的比较方法
		System.out.println("list 排序后：" + list);
		
		//自动调用Student的equals方法：
		System.out.println("list.contains(new Student('ID001', 50)) :" +list.contains(new Student("ID001", 50)));

	}

}
