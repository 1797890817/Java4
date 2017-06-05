package com.ddb.db.jdbc.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PstUpdateDemo {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/demo";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws SQLException {
		// 注册驱动
		Connection conn=null;
		PreparedStatement ps=null;
		
		// 执行操作
		int i;
		try {
			Class.forName(DBDRIVER);
			// 建立连接
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
			// 构建SQL语句
			//String sql = "update cv set name=?,age=?,mobile=? where id=? ;"; // ?是占位符
			String sql ="delete from cv where id =?";
			// 创建PreparedStatement语句对象
			ps = conn.prepareStatement(sql);
			// 设定位置参数
//		ps.setString(1, "zhaosi");
//		ps.setInt(2, 35);
//		ps.setLong(3, 13766665550L);
//		ps.setInt(4, 2);
			ps.setInt(1, 4);

			i = ps.executeUpdate();
			// 受影响的行
			System.out.println("i = " + i);
			System.out.println("执行结束！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 释放资源
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ps !=null) {
				ps.close();
			}
			if (conn !=null) {
				conn.close();
			}
		}
		

	}

}
