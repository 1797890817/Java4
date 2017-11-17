package com.ddb.javacore.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("niap.exe");
		FileOutputStream fos = new FileOutputStream("niapCopy.exe");

		int read = fis.read();
		while (read != -1) {
			fos.write(read);
			read = fis.read();
		}
		fis.close();
		fos.close();
		System.out.println("File copy OK!");

	}

}
