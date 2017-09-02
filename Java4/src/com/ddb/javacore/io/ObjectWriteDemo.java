package com.ddb.javacore.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("Person.objects");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// 开始写入对象
		oos.writeObject(new Person(1, "zhangsan", "123456"));
		oos.writeObject(new Person(2, "lisi", "654321"));
		oos.writeObject(new Person(3, "wanger", "888888"));
		oos.writeObject(new Person(4, "zhaosi", "777777"));

		// 关闭
		oos.flush();
		oos.close();
		fos.close();

		System.out.println("Write Object OK!");

	}

}
