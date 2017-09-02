package com.ddb.javacore.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Long, Student> hashMap = new HashMap<Long, Student>();
		// 添加元素
		hashMap.put(11L, new Student("ID001", 25));
		hashMap.put(12L, new Student("ID002", 20));
		hashMap.put(13L, new Student("ID003", 24));
		hashMap.put(14L, new Student("ID004", 30));
		hashMap.put(15L, new Student("ID005", 45));

		System.out.println("hashMap :" + hashMap);
		// 获取指定元素
		System.out.println("hashMap.get(13) :" + hashMap.get(13)); // 找不到元素
		System.out.println("hashMap.get(13L) :" + hashMap.get(13L));
		System.out.println("hashMap.get(17L) :" + hashMap.get(17L)); // 没有不报错，返回null

		// 获取元素，指定默认
		System.out.println("hashMap.getOrDefault(16L, new Student('IDAAA', 100)):"
				+ hashMap.getOrDefault(16L, new Student("IDAAA", 100)));

		// 判断键包含
		System.out.println("hashMap.containsKey(13L):" + hashMap.containsKey(13L));
		System.out.println("hashMap.containsKey(18L):" + hashMap.containsKey(18L));

		// 判断值
		System.out.println("hashMap.containsValue(new Student(\"ID002\", 21)) :"
				+ hashMap.containsValue(new Student("ID002", 21)));
		System.out.println("hashMap.containsValue(new Student(\"ID002\", 20)) :"
				+ hashMap.containsValue(new Student("ID002", 20)));

		// 输出所有的keys
		System.out.println("foreach 输出 key：");
		for (Long key : hashMap.keySet()) {
			System.out.println(key);
		}

		// 输出所有的values
		System.out.println("foreach 输出 values：");
		for (Student v : hashMap.values()) {
			System.out.println(v);
		}

		// 同时访问key和values
		System.out.println("foreach 输出 key--->values：");
		for (Entry<Long, Student> v : hashMap.entrySet()) {
			// System.out.println(v);
			System.out.println(v.getKey() + " ----> " + v.getValue());
		}

		hashMap.replace(13L, new Student("IDBBB", 42));
		System.out.println("replace 13L:");
		// 用put重复放
		hashMap.put(15L, null);	//对15L重新赋值
		hashMap.put(14L, null);
		hashMap.put(null, null);
		hashMap.put(null, null);

		for (Entry<Long, Student> v : hashMap.entrySet()) {
			System.out.println(v.getKey() + " ----> " + v.getValue());
		}

	}

}
