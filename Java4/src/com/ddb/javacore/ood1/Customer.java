package com.ddb.javacore.ood1;

public class Customer {
	int score;	//积分
	String cardType;	//卡类型 ，1表示VIP，0表示普通用户
	
	public void show() {
		System.out.println("积分："+ score+"，积分卡类型："+cardType);
	}

}
