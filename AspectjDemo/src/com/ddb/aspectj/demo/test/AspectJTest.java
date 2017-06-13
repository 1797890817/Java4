package com.ddb.aspectj.demo.test;

import com.ddb.aspectj.demo.service.Hello;
import com.ddb.aspectj.demo.service.World;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AspectJTest
{
	public static void main(String[] args)
	{
		Hello hello = new Hello();
		hello.foo();
		hello.addUser("孙悟空" , "7788");
		World world = new World();
		world.bar();
	}
}
