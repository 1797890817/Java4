package com.ddb.javacore.thread;

public class DemoStopThread {

	public static void main(String[] args) throws Exception {
		MyThread4Stop thread =new MyThread4Stop();
		System.out.println("启动线程...");
		thread.start();
		
		//休眠2秒
		Thread.sleep(2000);	//休眠两秒
		System.out.println("停止子线程的执行...");
		thread.setFlag(false);
		System.out.println("子线程停止！");

	}

}
