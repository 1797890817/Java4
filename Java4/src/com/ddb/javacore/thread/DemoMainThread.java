package com.ddb.javacore.thread;

import java.io.PrintStream;

public class DemoMainThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		/*PrintStream out = System.out;
		Thread thread = Thread.currentThread();
		out.println("thread.getName() : " + thread.getName());
		out.println("thread.getId() : " + thread.getId());
		out.println("thread.getPriority() : " + thread.getPriority());
		out.println("thread.isAlive() : " + thread.isAlive());
		out.println("thread.isDaemon() : " + thread.isDaemon());
		out.println("thread.isInterrupted() : " + thread.isInterrupted());
		out.println("thread.getThreadGroup() : " + thread.getThreadGroup());
		out.println("Thread.MAX_PRIORITY : " + Thread.MAX_PRIORITY);
		out.println("Thread.MIN_PRIORITY : " + Thread.MIN_PRIORITY);
		out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
		out.println("将休眠5秒");
		long start = System.currentTimeMillis();
		out.println("当前时间的毫秒是：" + start);
		Thread.sleep(5000);
		// long end = ;
		long end = System.currentTimeMillis();
		out.println("休眠时间结束的毫秒是：" + end);
		out.println("休眠5秒结束");
		System.out.println("总计时间：" + (end - start));
		out.println("即将调用：Thread.yield()");
		thread.yield(); // 让出CPU
		out.println("调用：Thread.yield()结束！");*/

		// 实现Runnable接口的方式
		Thread myRunable = new Thread(new MyRunnable());
		myRunable.setName("MyRunable");
		//myRunable.setDaemon(true);	
		//设置为后台线程，主线程结束则随之结束，若不是后台进程则不会因为主线程结束而子线程被强制结束
		myRunable.start();
		//Thread.sleep(2000);    //休眠2秒
		//myRunable.join(); //让主线程等待子线程执行完再执行！否则可能出现子线程没有正常执行结束！
		System.out.println("myRunable.isDaemon():" + myRunable.isDaemon());
		//修改为后台守护线程
		
		
	}

}
