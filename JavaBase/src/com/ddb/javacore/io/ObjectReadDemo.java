package com.ddb.javacore.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Person.objects");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// 读取对象数据信息
		Person person1 = (Person) ois.readObject();
		Person person2 = (Person) ois.readObject();
		Person person3 = (Person) ois.readObject();
		Person person4 = (Person) ois.readObject();

		// 输出对象
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);

		fis.close();
		
	}

}
