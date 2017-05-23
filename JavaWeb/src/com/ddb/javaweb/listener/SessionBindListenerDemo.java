package com.ddb.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class SessionBindListenerDemo
 *
 */
//说明此处实现比较接口是为了处理在线用户数运行的异常问题！
@WebListener
public class SessionBindListenerDemo implements HttpSessionBindingListener{
//public class SessionBindListenerDemo implements HttpSessionBindingListener, Comparable<SessionBindListenerDemo> {
	public int num = 0;

	public SessionBindListenerDemo() {

	}

	public SessionBindListenerDemo(int num) {
		this.num = num;
	}

	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("****valueBound :" + arg0.getName() + "=" + arg0.getValue());
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("****valueUnbound :" + arg0.getName());
	}

	@Override
	public String toString() {
		return "SessionBindListenerDemo [num=" + num + "]";
	}

	

//	@Override
//	public int compareTo(SessionBindListenerDemo o) {
//		if (num == o.num) {
//			return 0;
//		} else if (num > o.num) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

	
}
