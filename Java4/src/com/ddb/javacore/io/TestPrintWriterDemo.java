package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("aa.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		FileWriter fileWriter = new FileWriter("aaCopy.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		String s = bufferedReader.readLine();
		while (s != null) {
			printWriter.println(s);
			s = bufferedReader.readLine();
		}

		bufferedReader.close();
		printWriter.close();
		System.out.println("Copy Ok!");
	}

}
