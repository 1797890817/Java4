package com.ddb.app.service;

public class BookService
{
	private String[] books =
		new String[]{
		"疯狂Java讲义" ,
		"轻量级Java EE企业应用实战",
		"疯狂Ajax讲义",
		"疯狂iOS讲义"
	};

	public String[] getLeeBooks()
	{
		return books;
	}
}
