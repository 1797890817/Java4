package com.ddb.javaweb.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;

public class GetBooksThread implements Runnable {
	private AsyncContext actx = null;

	public GetBooksThread(AsyncContext actx) {
		this.actx = actx;
	}

	public void run() {
		try {
			// 等待5秒钟，以模拟业务方法的执行
			Thread.sleep(5 * 1000);
			ServletRequest request = actx.getRequest();
			List<String> books = new ArrayList<String>();
			books.add("Java从入门到精通");
			books.add("HTML5权威指南");
			books.add("JavaWeb开发实战经典");
			books.add("MySQL从入门到精通");
			books.add("JavaEE企业级开发");
			request.setAttribute("books", books);
			actx.dispatch("/listener/async.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
