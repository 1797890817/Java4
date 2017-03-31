package com.ddb.javacore.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		// 添加元素
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(44); // 重复加入
		System.out.println("set : " + set);

		// Iterator遍历set
		System.out.println("Iterator 遍历输出：");
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		// foreach 遍历
		System.out.println("foreach 遍历输出：");
		for (Integer integer : set) {
			System.out.println(integer);
		}

		HashSet<Integer> set2 = (HashSet<Integer>) set.clone();
		System.out.println("foreach 遍历输出set2：");
		for (Integer integer : set2) {
			System.out.println(integer);
		}

		// 整数类型的
		// 删除元素
		set2.remove(33);
		// 添加元素
		set2.add(55);
		System.out.println("set2 删除33，增加55...");
		System.out.println("foreach 遍历输出set2：");
		for (Integer integer : set2) {
			System.out.println(integer);
		}

		System.out.println("foreach 遍历set输出：");
		for (Integer integer : set) {
			System.out.println(integer);
		}

		// 自定义的类型，数字型clone后修改不影响原始的。引用型修改则影响！
		HashSet<Student> stSet = new HashSet<Student>();
		// Student student1 = new Student("zhangsan", 20);
		stSet.add(new Student("zhangsan", 20));
		stSet.add(new Student("lisi", 19));
		stSet.add(new Student("wangwu", 22));
		stSet.add(new Student("zhaosi", 30));
		System.out.println("stSet :" + stSet);

		HashSet<Student> stSet2 = (HashSet<Student>) stSet.clone();
		System.out.println("stSet2 : " + stSet2);
		
		//修改stset2
		for (Student student : stSet2) {
			student.age = 50;
		}
		System.out.println("修改stSet2 后：");
		System.out.println("stSet2 : " + stSet2);
		System.out.println("stSet : " + stSet);
	}
	
	

}
