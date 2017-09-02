package com.ddb.javacore.ood6;

public class TestRefDemo {

	public static void main(String[] args) {
		Student student1 = new Student("zhangsan");
		Student student2 = new Student("zhangsan");
		
		//==对于引用类型来说，是比较引用地址
		if (student1==student2) {
			System.out.println("student1 和 student2 ==相等");
		} else {
			System.out.println("student1 和 student2 ==不相等");
		}
		
		//equals相等，是比较对象内容，通常我们需要重写equals方法！
		if (student1.equals(student2)) {
			System.out.println("student1 和 student2 equals相等");
		}else {
			System.out.println("student1 和 student2 equals 不相等");	
		}
	}

}
