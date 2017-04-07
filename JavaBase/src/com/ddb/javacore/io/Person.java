package com.ddb.javacore.io;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;

	private int personId; // ID
	private String name; // 姓名
	//private String pass; // 密码
	private transient String pass; // 密码

	// 无参构造函数
	public Person() {
	}

	// 构造函数
	public Person(int personId, String name, String pass) {
		super();
		this.personId = personId;
		this.name = name;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", pass=" + pass + "]";
	}

}
