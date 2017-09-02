package com.ddb.javacore.ood1;

public class TestAc {
	String name = "张三丰";
	
	public void print() {
		//String name = "张翠山";
		System.out.println(name);
	}

	public static void main(String[] args) {
/*		// 创建admin1对象
		Administrator admin1 = new Administrator();
		admin1.name = "zhangsan";
		admin1.password = "123456";

		// 创建admin2对象
		Administrator admin2 = new Administrator();
		admin2.name = "lisi";
		admin2.password = "97654";

		System.out.println("admin2.name: " +admin2.name);
		// 分别调用两个对象的show方法
		admin1.show();
		admin2.show();

		// 创建客户对象
		Customer customer = new Customer();
		customer.score = 100;
		customer.cardType = "VIP";
		// 调用customer的show方法
		customer.show();*/
		
		TestAc test = new TestAc();
		System.out.println("test.name 默认值：" +test.name);
		test.print();
		
		
	}

}
