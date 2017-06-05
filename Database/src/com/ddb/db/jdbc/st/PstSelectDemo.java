package com.ddb.db.jdbc.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PstSelectDemo {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		// 构建SQL语句
		String sql = "select id,name as username,age from cv limit ?;";
		// 创建PreparedStatement语句对象
		PreparedStatement ps =conn.prepareStatement(sql);
		//设定参数值
		ps.setInt(1, 3);
		
		// 执行查询数据的操作
		ResultSet rs = ps.executeQuery();
		// 处理查询到的数据
		System.out.println("id" + "\t\t" + "name " + "\t\t" + "age " + "\t\t");

		while (rs.next()) {
			//使用字段的名字去取值
			/*int id = rs.getInt("id");
			String name = rs.getString("username");
			int age = rs.getInt("age");*/
			//使用字段的索引去取，从1开始
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			
			System.out.println("----------------------------------------------");
			System.out.print(id + "\t\t");
			System.out.print(name + "\t\t");
			System.out.print(age + "\t\t");
			System.out.println();
		}

		System.out.println("执行结束！");
		// 释放资源
		rs.close();
		ps.close();
		conn.close();

	}

}
