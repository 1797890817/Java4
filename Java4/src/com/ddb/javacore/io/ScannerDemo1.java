package com.ddb.javacore.io;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) throws Exception {
	/*	//使用字符串
		System.out.println("下面是使用字符串的方式：");
		Scanner scanner =new Scanner("AAA:BBB:CCC:DDD");
		scanner.useDelimiter(":");	//指定分隔符
		
		String info =null;
		while (scanner.hasNext()) {
			info =scanner.next();
			System.out.println(info);
		}
		
		//关闭
		scanner.close();*/

		//使用文件
		System.out.println("下面是使用文件的方式：");
		File file = new File("aa.txt");
		Scanner scanner2 =new Scanner(file);
		
		String fInfo =null;
		while (scanner2.hasNextLine()) {
			fInfo =scanner2.nextLine();
			System.out.println(fInfo);
		}
		scanner2.close();
		
		
	}

}
