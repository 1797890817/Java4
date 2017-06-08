package com.ddb.mvn.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloMavenTest {

	@Test
	public void testSayHello() {
		HelloMaven hm = new HelloMaven("lisi");
		System.out.println("hm.sayHello() :" + hm.sayHello());
		assertEquals("Hello Maven1", hm.sayHello());
		// fail("Not yet implemented");
	}

}
