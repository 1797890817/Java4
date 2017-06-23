package com.ddb.hibernate.embeddable;

import javax.persistence.Embeddable;

import org.hibernate.annotations.Parent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Embeddable
public class Name {
	// 定义first成员变量
	private String first;
	// 定义last成员变量
	private String last;
	// 引用拥有该Name的Person对象
	@Parent
	private Person owner;

	// 无参数的构造器
	public Name() {
	}

	// 初始化全部成员变量的构造器
	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

}