package com.ddb.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListenerDemo
 *
 */
@WebListener
public class SessionListenerDemo implements HttpSessionListener, HttpSessionAttributeListener,
		HttpSessionActivationListener, HttpSessionIdListener {

	/**
	 * Default constructor.
	 */
	public SessionListenerDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent param) {
		System.out.println("SessionListenerDemo --sessionCreated");
		System.out.println("    创建的 Session id=" + param.getSession().getId());
	}

	/**
	 * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
	 */
	public void sessionIdChanged(HttpSessionEvent paramHttpSessionEvent, String paramString) {
		System.out.println("SessionListenerDemo --sessionIdChanged");
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent param) {
		System.out.println("SessionListenerDemo --sessionDestroyed");
		System.out.println("    销毁的Session id=" + param.getSession().getId());
	}

	/**
	 * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
	 */
	public void sessionDidActivate(HttpSessionEvent paramHttpSessionEvent) {
		System.out.println("SessionListenerDemo --sessionDidActivate");
	}

	/**
	 * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
	 */
	public void attributeAdded(HttpSessionBindingEvent param) {
		System.out.println("SessionListenerDemo --attributeAdded");
		System.out.println("    添加属性：" + param.getName() + "=" + param.getValue());
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent param) {
		System.out.println("SessionListenerDemo --attributeReplaced");
		System.out.println("    替换属性之前：" + param.getName() + "=" + param.getValue());
		System.out.println("    替换属性之后：" + param.getName() + "=" + param.getSession().getAttribute(param.getName()));
	}

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent param) {
		System.out.println("SessionListenerDemo --attributeRemoved");
		System.out.println("    删除属性：" + param.getName());
	}

	/**
	 * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
	 */
	public void sessionWillPassivate(HttpSessionEvent paramHttpSessionEvent) {
		System.out.println("SessionListenerDemo --sessionWillPassivate");
	}

}
