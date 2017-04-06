package com.ddb.javacore.io;

import java.io.File;
import java.util.Date;

public class TestFileDemo {

	public static void main(String[] args) {
		// File file1 = new File("a.jpg");
		// File file1 = new File("aa.txt");
		File file1 = new File("niap.exe");
		File file2 = new File("D:/temp/");

		System.out.println("file1.getName(): " + file1.getName());
		System.out.println("file1.getPath(): " + file1.getPath());
		System.out.println("file1.getAbsolutePath(): " + file1.getAbsolutePath());
		System.out.println("file1.getParent(): " + file1.getParent());
		System.out.println("file1.lastModified(): " + new Date(file1.lastModified()));
		System.out.println("file1.length(): " + file1.length());
		System.out.println("file1.exists() :" + file1.exists());
		System.out.println("file1.canRead() :" + file1.canRead());
		System.out.println("file1.canWrite() :" + file1.canWrite());
		System.out.println("file1.canExecute() :" + file1.canExecute());

		System.out.println("file1.isFile(): " + file1.isFile());
		System.out.println("file1.isHidden() :" + file1.isHidden());
		System.out.println("file1.isDirectory() : " + file1.isDirectory());
		// file2.mkdirs(); // 创建目录
		System.out.println("file2.isDirectory() : " + file2.isDirectory());
		System.out.println("file1.isAbsolute() : " + file1.isAbsolute());
		file2.delete();

	}

}
