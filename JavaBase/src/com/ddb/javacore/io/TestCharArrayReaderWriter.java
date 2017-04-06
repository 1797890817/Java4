package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class TestCharArrayReaderWriter {

	public static void main(String[] args) throws IOException {
		char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
		CharArrayReader charArrayReader = new CharArrayReader(charArray);
		BufferedReader bufferedReader = new BufferedReader(charArrayReader);

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		BufferedWriter bufferedWriter = new BufferedWriter(charArrayWriter);

		char[] buf = new char[charArray.length];
		bufferedReader.read(buf, 0, charArray.length);
		//System.out.println(String.valueOf(buf));
		
		bufferedWriter.write(buf);
		//bufferedWriter.close();	//这一行不可少
		bufferedWriter.flush();		//这一行不可少
		System.out.println(charArrayWriter);
	}
}
