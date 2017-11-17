package com.ddb.javacore.reflect;

import java.lang.reflect.Field;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		//传统方式
	/*	//Person person = new Person();
		System.out.println(person);
		person.setAge(40);
		System.out.println(person);*/
		

		//利用反射的方式
		Class clazz = Class.forName("com.ddb.javacore.reflect.Person"); // 方式一
		// 创建一个对象
		Object object = clazz.newInstance();	//调用无参构造函数
		System.out.println("object 设定属性前:" +object);
		
		
		// 得到属性
		Field ageF = clazz.getDeclaredField("age");

		// 设定强制访问
		ageF.setAccessible(true);

		// 设定属性
		ageF.set(object, 40);
		
		System.out.println("设定属性后：");
		System.out.println(object);
		System.out.println((Person) object);//对比
		
	}

}
