package com.ddb.javacore.thread;

public class DemoProducersConsumers {

	public static void main(String[] args) {
		Account account = new Account("123456", 0);	//相当于仓库
		
		Thread drawMoneyThread = new DrawMoneyThread("***取钱线程", account, 700);	//消费者
		Thread depositeMoneyThread = new DepositeMoneyThread("###存钱线程", account, 700);	//生产者

		drawMoneyThread.start();
		depositeMoneyThread.start();
	}

}