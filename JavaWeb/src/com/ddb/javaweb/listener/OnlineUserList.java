package com.ddb.javaweb.listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineUserList
 *
 */
@WebListener
public class OnlineUserList implements HttpSessionAttributeListener, HttpSessionListener, ServletContextListener {
	private ServletContext app = null;

	/**
	 * Default constructor.
	 */
	public OnlineUserList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent paramServletContextEvent) {
		this.app = paramServletContextEvent.getServletContext();	//实例化application
		this.app.setAttribute("online", new TreeSet());		//初始化容器
	}

	
	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent paramHttpSessionEvent) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent paramHttpSessionEvent) {
		Set all = (Set) this.app.getAttribute("online");
		if (all.size() > 0) {
			all.remove(paramHttpSessionEvent.getSession().getAttribute("userid"));
		}
		this.app.setAttribute("online", all);
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent paramServletContextEvent) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
		Set all = (Set) this.app.getAttribute("online");
		String param = (String) paramHttpSessionBindingEvent.getName();
		if ("userid".equals(param)) {
			String name = (String) paramHttpSessionBindingEvent.getValue();
			try {
				name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			all.add(name);
			this.app.setAttribute("online", all);
		}else {
			System.out.println("......增加的属性并不是userid！......");
		}

	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
		Set all = (Set) this.app.getAttribute("online");
		String param = (String) paramHttpSessionBindingEvent.getName();
		if ("userid".equals(param)) {
			all.remove(paramHttpSessionBindingEvent.getValue());
			this.app.setAttribute("online", all);
		}
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent paramHttpSessionBindingEvent) {
		// TODO Auto-generated method stub
	}

	
}
