package com.ddb.javacore.enumdemo;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum WeekEnum2 {
	MONDAY(1, "星期一"), TUESDAY(2, "星期二"), WEDNESDAY(3, "星期三"), THURDAY(4, "星期四"), FRIDAY(5, "星期五"), SATURDAY(6,
			"星期六"), SUNDAY(7, "星期日");
	
	@Setter		//@Setter不支持写在枚举上面
	private int index; // 索引
	@Setter
	private String desc; // 描述

	public static final int DEMO = 0;

	private WeekEnum2(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

}
