package com.ddb.javacore.ood5;

public class StudentImpl extends Human implements IStudent {

	@Override
	public void study() {
		System.out.println("我是学生，我在学习！");
	}

	@Override
	public void study(String java) {
		System.out.println("我正在学习：" +java);

	}

	@Override
	public void showInfo() {
		System.out.println("我是showInfo方法，我被执行");
		
	}

}
