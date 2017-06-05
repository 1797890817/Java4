package com.ddb.db.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
	public static final String DBDRIVER ="com.mysql.jdbc.Driver";
	public static final String DBURL ="jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER ="root";
	public static final String DBPWD ="root";
	

	public static void main(String[] args) throws Exception {
		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建statement语句对象
		Statement stmt = conn.createStatement();
		
		//构建SQL语句
		String sql = "insert into cv (name,age) values('lisi',35);";
		//执行插入数据的操作
		stmt.executeUpdate(sql);
		
		System.out.println("执行结束！");
		//释放资源
		stmt.close();
		conn.close();
		
	}

}
