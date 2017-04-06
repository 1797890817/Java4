package com.ddb.javacore.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReaderDemo {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		try {
			s = br.readLine();
			while (!s.equals("")) {
				System.out.println("Read:" + s);
				s = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
