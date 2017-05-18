package com.ddb.javaweb.servlet.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnterDemo
 */
@WebServlet("/EnterDemo")
public class LoginEnterDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginEnterDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		if ("zhangsan".equals(name) && "123456".equals(pwd)) {
			//保存用户名在session中
			request.getSession().setAttribute("userId", name);
			
			ServletContext context = getServletContext();
			// 得到RequestDispatcher对象，调用forward()
			RequestDispatcher rd = context.getRequestDispatcher("/Servlet/welcome.jsp");
			rd.forward(request, response);
		} else {// 得到RequestDispatcher对象，调用include()
			RequestDispatcher rd = request.getRequestDispatcher("/LoginDemo");
			rd.include(request, response);
		}

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
