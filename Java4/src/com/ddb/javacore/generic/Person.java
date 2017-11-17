package com.ddb.javacore.generic;

public class Person<T> {
	private String name;
	private T pass;

	// 下面的get和set方法可以用工具生成！
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getPass() {
		return pass;
	}

	public void setPass(T pass) {
		this.pass = pass;
	}

}
