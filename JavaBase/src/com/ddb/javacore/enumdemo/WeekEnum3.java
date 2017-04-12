package com.ddb.javacore.enumdemo;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum WeekEnum3 implements Behaviour {

	MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"), THURDAY(4, "星期四"), FRIDAY(5, "星期五"), SATURDAY(6, "星期六") {
		@Override // 在接口的实例中重写指定的方法
		public boolean isRest() {
			return true;
		}
	},
	SUNDAY(7, "星期日") {
		@Override // 在接口的实例中重写指定的方法
		public boolean isRest() {
			return true;
		}
	};

	@Setter // @Setter不支持写在枚举上面
	private int index; // 索引
	@Setter
	private String desc; // 描述

	public static final int DEMO = 0;

	private WeekEnum3(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	@Override
	public void print() {
		System.out.println("我是print方法打印的内容：" + this.index + "--" + this.desc);
	}

	@Override
	public String getInfo() {
		return "WeekEnum3:" + this.index + "--" + this.desc;
	}

	public boolean isRest() { // 是否是休息日
		return false;
	}

}
