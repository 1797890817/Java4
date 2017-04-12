package com.ddb.javacore.enumdemo;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class TestEnum {

	public static void main(String[] args) {

		// 遍历枚举
		System.out.println("WeekEnum : ");
		for (WeekEnum week : WeekEnum.values()) { // System.out.println(week);
			System.out.println(week.name() + "----" + week.ordinal());
		}

		System.out.println("WeekEnum : ");
		for (WeekEnum2 week2 : WeekEnum2.values()) { //
			System.out.println(week2);
			String tmp = week2.name() + "----" + week2.ordinal() + "----" + week2.getIndex() + "----" + week2.getDesc();
			System.out.println(tmp);
		}

		// 和switch 一起使用
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
		}

		// 枚举实现接口
		Behaviour behaviour = WeekEnum3.SATURDAY;
		// Behaviour behaviour = new WeekEnum3(8,"Test"); //不可以实例化

		behaviour.print();
		System.out.println(behaviour.getInfo());

		// 在接口的实例中重写指定的方法
		System.out.println("WeekEnum3.MONDAY.isRest():" + WeekEnum3.MONDAY.isRest());
		System.out.println("WeekEnum3.SATURDAY.isRest():" + WeekEnum3.SATURDAY.isRest());
		System.out.println("WeekEnum3.SUNDAY.isRest():" + WeekEnum3.SUNDAY.isRest());

		// 使用接口中组织的枚举
		System.out.println("使用接口中组织的枚举:");
		System.out.println("Food.Coffee.BLACK_COFFEE:" + Food.Coffee.BLACK_COFFEE.ordinal());
		System.out.println("Food.Coffee.CAPPUCCINO:" + Food.Coffee.CAPPUCCINO.ordinal());
		System.out.println("Food.Coffee.LATTE:" + Food.Coffee.LATTE.ordinal());

		System.out.println("Food.Dessert.CAKE:" + Food.Dessert.CAKE);
		System.out.println("Food.Dessert.FRUIT:" + Food.Dessert.FRUIT);
		System.out.println("Food.Dessert.GELATO:" + Food.Dessert.GELATO);

		// EnumSet保证集合中的元素不重复;EnumMap中的 key是enum类型，而value则可以是任意类型。
		EnumSet<WeekEnum2> weekEnum2Set = EnumSet.allOf(WeekEnum2.class);// 直接将枚举实例转换为集合元素
		for (WeekEnum2 week : weekEnum2Set) {
			System.out.println(week);
		}

		EnumMap<WeekEnum2, String> weekMap = new EnumMap(WeekEnum2.class);
		weekMap.put(WeekEnum2.MONDAY, "一");
		weekMap.put(WeekEnum2.TUESDAY, "二");
		weekMap.put(WeekEnum2.WEDNESDAY, "三");
		weekMap.put(WeekEnum2.THURDAY, "四");
		weekMap.put(WeekEnum2.FRIDAY, "五");
		weekMap.put(WeekEnum2.SATURDAY, "六");
		weekMap.put(WeekEnum2.SUNDAY, "日");
		for (Entry<WeekEnum2, String> entry : weekMap.entrySet()) {
			System.out.println(entry.getKey().getIndex() + "--" + entry.getKey().getDesc() + "--" + entry.getValue());
		}

		// 枚举实例的比较
		WeekEnum2 enum2 = WeekEnum2.MONDAY;
		// WeekEnum2 enum2 = WeekEnum2.SUNDAY;
		int compareTo = enum2.compareTo(WeekEnum2.SATURDAY);
		System.out.println("compareTo ：" +compareTo);	//值为-5
		//值并不是标准的-1、0、1，用switch..case会有bug，这一点要特别注意！
		if (compareTo < 0) {
			System.out.println(enum2.getDesc() + " 在前面");
		} else if (compareTo > 0) {
			System.out.println(enum2.getDesc() + " 在后面");
		} else {
			System.out.println(enum2.getDesc() + " 位置一样！");
		}
	}

}
