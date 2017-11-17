package com.ddb.javacore.annotation;

import java.lang.reflect.Field;

public class AnnotationProcessor {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// 得到Class实例
		Class<?> clazz = Person.class;

		// 得到被反射类的一个实例
		Person person = (Person) clazz.newInstance();
		System.out.println("Person 默认值：");
		person.showInfo();

		// 获得所有的字段
		Field[] fields = clazz.getDeclaredFields(); // 不能获取到继承的属性
		// Field[] fields = clazz.getFields(); //可以获取到公开的继承的属性

		for (Field field : fields) {
			// 判断该属性上是否存在HelloWorld注解
			if (field.isAnnotationPresent(HelloWorld.class)) {
				// 获取指定的注解
				HelloWorld annotation = field.getAnnotation(HelloWorld.class);
				System.out.println("HelloWorld注解的值是：" + annotation.value());

				// 打破封装
				field.setAccessible(true);
				// 将注解的值赋给属性值
				field.set(person, annotation.value());

			} /*else if (field.isAnnotationPresent(Default.class)) {
				Default default1 = field.getAnnotation(Default.class);
				System.out.println("Default注解的值是：" + default1.value());
				field.setAccessible(true); // 获取字段的数据类型
				System.out.println(field.getType().getSimpleName().toString());

				switch (field.getType().getSimpleName().toString()) {
				case "int":
					field.set(person, Integer.valueOf(default1.value()));
					break;
				case "double":
					field.set(person, Double.valueOf(default1.value()));
					break;
				case "String":
					field.set(person, default1.value());
					break;
				default:
					break;
				}
			}*/
		}

		System.out.println("注解后的值：");
		person.showInfo();

	}

}
