package com.ddb.db.jdbc.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement st = null;
		
		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//取消自动提交
		conn.setAutoCommit(false);
		// 创建statement语句对象
		st = conn.createStatement();
		// 构建SQL语句
		try {
			String sql = "insert into cv (name,age) values";
			// st.addBatch(sql+" ('zhaoliu01',50);");
			// st.addBatch(sql+" ('zhaoliu02',51);");
			// st.addBatch(sql+" ('zhaoliu03',52);");
			// st.addBatch(sql+" ('zhaoliu04',53);");
			// st.addBatch(sql+" ('zhaoliu05',54);");

			st.addBatch(sql + " ('zhaoliu21',60);");
			st.addBatch(sql + " ('zhaoliu22',61);");
			// 制造错误
			st.addBatch(sql + " ('zhaoliu23',62);"); // 这一行记录不会进到数据库
			st.addBatch(sql + " ('zhaoliu24',63);");
			st.addBatch(sql + " ('zhaoliu25',64);");
			// 执行插入数据的操作
			st.executeBatch();
			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}

		System.out.println("执行结束！");
		// 释放资源
		st.close();
		conn.close();

	}

}
