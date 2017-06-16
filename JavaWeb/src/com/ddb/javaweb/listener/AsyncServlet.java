package com.ddb.javaweb.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/async",asyncSupported=true)
public class AsyncServlet extends HttpServlet
{
	/**
	 * Test code from JavaEE 李刚...
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request
		, HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		out.println("<title>异步调用示例</title>");
		out.println("进入Servlet的时间："
			+ new java.util.Date() + ".<br/>");
		// 创建AsyncContext，开始异步调用
		AsyncContext actx = request.startAsync();
		
		//为该异步调用注册监听器,仅能监视到结束事件！
		actx.addListener(new RequestListenerDemo());
		
		// 设置异步调用的超时时长
		actx.setTimeout(60 * 1000);
		// 启动异步调用的线程，该线程以异步方式执行
		actx.start(new GetBooksThread(actx));
		out.println("结束Servlet的时间："
			+ new java.util.Date() + ".<br/>");
		out.flush();
	}
}
