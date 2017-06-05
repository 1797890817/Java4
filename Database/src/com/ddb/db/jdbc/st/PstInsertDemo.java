package com.ddb.db.jdbc.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PstInsertDemo {
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
		String sql = "insert into cv (id,name,age,mobile) values(?,?,?,?);"; // ?是占位符
		// 创建PreparedStatement语句对象
		PreparedStatement ps = conn.prepareStatement(sql);
		// 设定位置参数
		ps.setInt(1, 4);
		ps.setString(2, "liu");
		ps.setInt(3, 29);
		ps.setLong(4, 13866665550L);

		// 执行插入数据的操作
		int i = ps.executeUpdate();

		// 受影响的行
		System.out.println("i = " + i);
		System.out.println("执行结束！");
		// 释放资源
		ps.close();
		conn.close();

	}

}
