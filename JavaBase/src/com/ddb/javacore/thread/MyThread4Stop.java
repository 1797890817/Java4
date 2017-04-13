package com.ddb.javacore.thread;

import lombok.Getter;
import lombok.Setter;

public class MyThread4Stop extends Thread { // 继承Thread的方式
	@Getter
	@Setter
	private boolean flag = true; // 默认等于true

	@Override
	public void run() {
		while (flag) {
			System.out.println("********");
		}
	}

}
