package com.ddb.db.jdbc.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StUpdateDeleteDemo {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		// 创建statement语句对象
		Statement stmt = conn.createStatement();

		// 构建SQL语句
		// 更新记录
		// String sql = "update cv set age=39 where id=3;";
		// String sql = "update cv set age=39;";

		// 删除记录
		// String sql = "delete from cv where id=13;";
		String sql = "delete from cv;";

		// 受影响的行数
		int i = stmt.executeUpdate(sql);

		System.out.println("i =" + i);
		// 释放资源

		stmt.close();
		conn.close();
	}

}
