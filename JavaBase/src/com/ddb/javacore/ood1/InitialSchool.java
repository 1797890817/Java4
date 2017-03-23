package com.ddb.javacore.ood1;

public class InitialSchool {
	public static void main(String[] args) {
		School center = new School();
		System.out.println("***初始化成员变量前***");
		center.showCenter();

		center.schoolName = "北京中心";
		center.classNumber = 10;
		center.labNumber = 10;
		System.out.println("\n***初始化成员变量后***");
		center.showCenter();
	}
}
