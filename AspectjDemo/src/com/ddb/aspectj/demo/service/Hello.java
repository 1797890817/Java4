package com.ddb.aspectj.demo.service;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Hello
{
	// ����һ���򵥷�����ģ��Ӧ���е�ҵ���߼�����
	public void foo()
	{
		System.out.println("ִ��Hello�����foo()����");
	}
	// ����һ��addUser()������ģ��Ӧ���е�����û��ķ���
	public int addUser(String name , String pass)
	{
		System.out.println("ִ��Hello�����addUser����û���" + name);
		return 20;
	}
}

