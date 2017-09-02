package com.ddb.javacore.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataByteStreamDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("myfile.data");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

		dataOutputStream.writeUTF("罗斯福");
		dataOutputStream.writeInt(40);
		dataOutputStream.close();
		fileOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("myfile.data");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		System.out.println("name :" + dataInputStream.readUTF());
		System.out.println("age: " + dataInputStream.readInt());

		fileInputStream.close();
		dataInputStream.close();

	}

}
