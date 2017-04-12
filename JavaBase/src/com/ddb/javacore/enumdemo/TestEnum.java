package com.ddb.javacore.enumdemo;

public class TestEnum {

	public static void main(String[] args) {
		/*// 遍历枚举
		System.out.println("WeekEnum : ");
		for (WeekEnum week : WeekEnum.values()) {
			//System.out.println(week);
			System.out.println(week.name() + "----" + week.ordinal());
		}*/

		/*System.out.println("WeekEnum : ");
		for (WeekEnum2 week2 : WeekEnum2.values()) {
			 //System.out.println(week2);
			String tmp = week2.name() + "----" + week2.ordinal() + "----" + week2.getIndex() + "----" + week2.getDesc();
			System.out.println(tmp);
		}*/

		/*// 和switch 一起使用
		WeekEnum2 weekEnum2 = WeekEnum2.SATURDAY;
		switch (weekEnum2) {
		case SATURDAY:
			System.out.println("SATURDAY:" + weekEnum2.getDesc());
			break;
		case SUNDAY:
			System.out.println("SUNDAY:" + weekEnum2.getDesc());
			break;

		default:
			break;
		}*/

		// 枚举实现接口
		Behaviour behaviour = WeekEnum3.SATURDAY;
		//Behaviour behaviour = new WeekEnum3(8,"Test"); //不可以实例化
		
		behaviour.print();
		System.out.println(behaviour.getInfo());

	}

}
