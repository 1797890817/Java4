package com.ddb.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/Servlet/ThreadSafe")
public class ServletThreadSafe extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final Lock lock = new ReentrantLock();	//创建出Lock实例
	String name = "";// 实例变量,多线程共享

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletThreadSafe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
/*	protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {*/
		
 protected void doGet(HttpServletRequest request, HttpServletResponse
		 response) throws ServletException, IOException {
		// lock.lock();
		response.setContentType("text/html;charset=UTF-8");// 设置文档类型及字符集
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Servlet线程安全问题</TITLE></HEAD>");
		out.println("<BODY>");
		String username = request.getParameter("username");
		// String name = new String(username.getBytes("iso-8859-1"), "UTF-8");
		name = new String(username.getBytes("iso-8859-1"), "UTF-8");

		try {
			Thread.sleep(10000); // 休眠10秒
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<H3>您好, " + name + "!</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
		//lock.unlock();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
