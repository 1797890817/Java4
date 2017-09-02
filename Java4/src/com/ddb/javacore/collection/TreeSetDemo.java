package com.ddb.javacore.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<Student>();
		// 添加元素
		treeSet.add(new Student("ID001", 23));
		treeSet.add(new Student("ID002", 33));
		treeSet.add(new Student("ID003", 20));
		treeSet.add(new Student("ID004", 40));
		treeSet.add(new Student("ID005", 19));
		System.out.println("treeSet :" + treeSet);

		// 迭代
		Iterator<Student> iterator = treeSet.iterator();
		System.out.println("使用迭代器输出：");
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}

		// foreach 遍历
		System.out.println("使用foreach 遍历：");
		for (Student student : treeSet) {
			System.out.println(student);
		}

		System.out.println("treeSet.first() :" + treeSet.first()); // 获取第一个元素
		System.out.println("treeSet.last() :" + treeSet.last()); // 获取最后一个元素

		// 获取大于等于给定元素的最小元素
		System.out.println(treeSet.ceiling(new Student("ID00A", 22)));
		System.out.println(treeSet.ceiling(new Student("ID00B", 23)));

		// 获取小于等于给定元素的最大元素
		System.out.println("**********************************");
		System.out.println(treeSet.floor(new Student("ID00A", 22)));
		System.out.println(treeSet.floor(new Student("ID00B", 23)));

		// 获取严格大于给定元素，不取相等的情况
		System.out.println("--------------------------------------");
		System.out.println(treeSet.higher(new Student("ID00A", 22)));
		System.out.println(treeSet.higher(new Student("ID00B", 23)));

		// 获取严格小于给定元素，不取相等的情况
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		System.out.println(treeSet.lower(new Student("ID00A", 22)));
		System.out.println(treeSet.lower(new Student("ID00B", 23)));

		System.out.println("treeSet.headSet(new Student('ID00A', 22)) :" + treeSet.headSet(new Student("ID00A", 22)));
		System.out.println("treeSet.headSet(new Student('ID00B', 23)) :" + treeSet.headSet(new Student("ID00B", 23)));

		// 返回一个视图的一部分这个集合的元素是大于或等于fromElement
		System.out.println("**************************************");
		System.out.println("treeSet.tailSet(new Student('ID00A', 22)) :" + treeSet.tailSet(new Student("ID00A", 22)));
		System.out.println("treeSet.tailSet(new Student('ID00B', 23)) :" + treeSet.tailSet(new Student("ID00B", 23)));

		
		Iterator<Student> descIterator = treeSet.descendingIterator();	//得到降序的迭代器
		while (descIterator.hasNext()) {
			Student student = (Student) descIterator.next();
			System.out.println(student);
		}
	}

}
