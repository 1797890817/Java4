package com.ddb.javacore.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DemoThreadRunableCallable {

	public static void main(String[] args) {
		// 继承Thread类的方式：
		Thread myThread = new MyThread();
		myThread.setName("MyThread");
		myThread.start();	//启动线程，并不是立即执行，只是说准备好了，可以被CPU调用执行！

		// 实现Runnable接口的方式
		Thread myRunable = new Thread(new MyRunnable());
		myRunable.setName("MyRunable");
		myRunable.start();

		// 实现Callable接口的方式：	---可以得到运行的返回值	----了解即可
		Callable<Integer> myCallable = new MyCallable(); // 创建MyCallable对象
		FutureTask<Integer> ft = new FutureTask<Integer>(myCallable); // 使用FutureTask来包装MyCallable对象
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 30) {
				Thread thread = new Thread(ft); // FutureTask对象作为Thread对象的target创建新的线程
				thread.start(); 	// 线程进入到就绪状态
			}
		}

		System.out.println("主线程for循环执行完毕..");
		try {
			int sum = ft.get(); 	// 取得新创建的新线程中的call()方法返回的结果
			System.out.println("sum = " + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
