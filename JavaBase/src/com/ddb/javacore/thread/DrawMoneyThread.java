package com.ddb.javacore.thread;

//取钱
public class DrawMoneyThread extends Thread {

	private Account account;
	private double amount;

	public DrawMoneyThread(String threadName, Account account, double amount) {
		super(threadName);
		this.account = account;
		this.amount = amount;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.draw(amount, i);
		}
		System.out.println("----取钱的次数结束！----");
	}
}