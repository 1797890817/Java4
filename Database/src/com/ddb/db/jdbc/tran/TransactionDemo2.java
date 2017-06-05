package com.ddb.db.jdbc.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo2 {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement st = null;
		Savepoint sp = null;

		// 注册驱动
		Class.forName(DBDRIVER);
		// 建立连接
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		// 取消自动提交
		conn.setAutoCommit(false);
		// 创建statement语句对象
		st = conn.createStatement();
		// 构建SQL语句
		try {
			String sql = "insert into cv (name,age) values";
			// st.executeUpdate(sql+" ('zhaoliu01',50);");
			// st.executeUpdate(sql+" ('zhaoliu02',51);");
			// st.executeUpdate(sql+" ('zhaoliu03',52);");
			// st.executeUpdate(sql+" ('zhaoliu04',53);");
			// st.executeUpdate(sql+" ('zhaoliu05',54);");

			// st.executeUpdate(sql + " ('zhaoliu21',60);");
			// st.executeUpdate(sql + " ('zhaoliu22',61);");
			// // 制造错误
			// st.executeUpdate(sql + " ('zhaoliu23',62);"); // 这一行记录不会进到数据库
			// st.executeUpdate(sql + " ('zhaoliu24',63);");
			// st.executeUpdate(sql + " ('zhaoliu25',64);");
			
			st.executeUpdate(sql + " ('zhaoliu41',60);");
			st.executeUpdate(sql + " ('zhaoliu42',61);");
			// 设定一个保存点
			sp = conn.setSavepoint();
			// 制造错误
			st.executeUpdate(sql + " ('zhaoliu43’,62);"); // 这一行记录不会进到数据库
			sp = conn.setSavepoint();
			st.executeUpdate(sql + " ('zhaoliu44',63);");
			sp = conn.setSavepoint();
			st.executeUpdate(sql + " ('zhaoliu45',64);");

			conn.commit();
		} catch (Exception e) {
			if (sp != null) {
				conn.rollback(sp);
				conn.commit();
			} else {
				conn.rollback();
			}

			// conn.rollback();
			e.printStackTrace();
		}

		System.out.println("执行结束！");
		// 释放资源
		st.close();
		conn.close();
	}

}
