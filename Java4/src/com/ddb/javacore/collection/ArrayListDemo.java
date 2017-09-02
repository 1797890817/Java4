package com.ddb.javacore.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		// List list = new ArrayList<String>(); //使用接口类型
		ArrayList<String> list = new ArrayList<String>(); // 使用原始类型
		ArrayList<String> l = new ArrayList<String>(); // 使用原始类型
		l.add("人");
		l.add("民");

		// 添加元素
		list.add("中");
		list.add("华");
		list.add("人");
		list.add("民");
		list.add("共");
		list.add("和");
		list.add("国");
		list.add("国"); // 添加重复元素

		// foreach 输出
		out.println("list 的内容：");
		for (String string : list) {
			out.println(string);
		}

		// 指定的位置再添加元素
		list.add(0, "我");
		list.add(1, "爱");
		out.println("指定的位置再添加元素 -list 的内容：");
		Iterator<String> iterator = list.iterator();
		// 使用迭代输出
		System.out.println("使用迭代输出:");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

		}

		// 获取元素
		System.out.println("list.get(0):" + list.get(0));

		// 删除list的元素
		list.remove(0); // 删除指定位置的元素，0表示第一个位置
		System.out.println("删除list的元素0后使用迭代输出:");
		Iterator<String> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);

		}

		// 包含测试
		System.out.println("list 包含 华 ：" + list.contains("华"));
		// 测试非空
		System.out.println("list 非空：" + list.isEmpty());
		// 获取list的容量
		System.out.println("list.size() = " + list.size());

		list.remove("爱");
		System.out.println("删除list的元素 爱 后使用迭代输出:");
		Iterator<String> iterator3 = list.iterator();
		while (iterator3.hasNext()) {
			String string = (String) iterator3.next();
			System.out.println(string);
		}

		System.out.println("list.indexOf('国') :" + list.indexOf("国"));
		System.out.println("list.lastIndexOf('国') :" + list.lastIndexOf("国"));

		// 直接打印list
		System.out.println("list : " + list);
		System.out.println("list.subList(2, 6) :" + list.subList(2, 6)); // toindex

		List<String> list2 = list.subList(2, 6); // 修改list2 会影响list
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));

		// list2 添加元素
		list2.add("CN");
		System.out.println(list2);
		System.out.println(list);
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2));

		//list.removeAll(list);	//删除自己的所有元素
		//list.clear();	//清除所有元素
		
		list.retainAll(l);
		System.out.println("list.size() :" + list.size());
		System.out.println(list);
		
	}

}
