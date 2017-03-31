package com.ddb.javacore.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		// 添加数据
		list.add(33);
		list.add(55);
		list.add(44);
		list.add(66);
		list.add(22);

		System.out.println(list);
		// 在首部增加
		list.addFirst(11);
		System.out.println("list.addFirst(11) : " + list);
		// 在尾部增加
		list.addLast(77);
		System.out.println("list.addLast(77) : " + list);
		System.out.println("list.getFirst() : " + list.getFirst());
		System.out.println("list.getLast() : " + list.getLast());

		System.out.println("list.peek() :" + list.peek()); // 返回list首元素，但是不删除首元素
		System.out.println(list);
		System.out.println("list.poll() : " + list.poll()); // 返回首元素，并删除list中的首元素
		System.out.println(list);

		System.out.println("list.offer(88) :" + list.offer(88)); // 加到尾部
		System.out.println(list);

		System.out.println("list.offerFirst(00) : " + list.offerFirst(00));
		System.out.println(list);

		System.out.println("list.element() :" + list.element());	//返回但是不删除首元素
		System.out.println(list);
		
		System.out.println("list.contains(66) : " +list.contains(66));
		System.out.println("list.contains(99) : " +list.contains(99));
		
		list.set(2, 50);
		System.out.println("list.set(2, 50) :" +list);
	}

}
