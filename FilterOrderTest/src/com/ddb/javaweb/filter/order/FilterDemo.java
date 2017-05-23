package com.ddb.javaweb.filter.order;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class FilterDemo
 */
//@WebFilter(
//		filterName="Xx",
//		dispatcherTypes = {
//				DispatcherType.REQUEST, 
//				DispatcherType.FORWARD, 
//				DispatcherType.INCLUDE, 
//				DispatcherType.ERROR
//		}
//					, 
//		initParams = { 
//				@WebInitParam(name = "charset", value = "UTF-8", description = "Use UTF-8 encoding")
//		}, 
//		urlPatterns={"/*"})
		//servletNames = { "LoginServletDemo" })	//指定的Servlet一定要有name名称！
public class FilterDemo implements Filter {
	String charset ="UTF-8";
	

    /**
     * Default constructor. 
     */
    public FilterDemo() {
        // TODO Auto-generated constructor stub
    }

    
    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
    	System.out.println("FilterDemo init()执行中....");
//    	charset = fConfig.getInitParameter("charset");
//    	System.out.println("FilterDemo 的charset="+charset);
//    	System.out.println("FilterDemo init()执行中结束");
    }

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterDemo 执行...");
		request.setCharacterEncoding(charset);
		response.setCharacterEncoding(charset);
		chain.doFilter(request, response);	//向下放行
		System.out.println("FilterDemo 执行结束！");
	}
	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("FilterDemo 销毁....");
	}

}
