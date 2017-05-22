package com.ddb.javaweb.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListenerDemo
 *
 */
@WebListener
public class ServletContextListenerDemo implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent param)  { 
         System.out.println("ServletContextListenerDemo --attributeAdded");
         System.out.println("    attributeAdded:" +param.getName()+"=" +param.getValue() );
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent param)  { 
    	System.out.println("ServletContextListenerDemo --attributeRemoved");
    	System.out.println("    attributeRemoved:" +param.getName());
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent paramServletContextEvent)  { 
    	System.out.println("ServletContextListenerDemo --contextDestroyed");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent param)  { 
    	System.out.println("ServletContextListenerDemo --attributeReplaced");
    	System.out.println("    attributeReplaced之前:" +param.getName()+"=" +param.getValue() );
    	System.out.println("    attributeReplaced之后:" +param.getName()+"=" +param.getServletContext().getAttribute(param.getName()));
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent paramServletContextEvent)  { 
        System.out.println("ServletContextListenerDemo --contextInitialized");
    }
	
}
