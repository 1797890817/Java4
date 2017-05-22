package com.ddb.javaweb.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestListenerDemo
 *
 */
//@WebListener
public class RequestListenerDemo implements ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

    /**
     * Default constructor. 
     */
    public RequestListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see AsyncListener#onComplete(AsyncEvent)
     */
    public void onComplete(AsyncEvent arg0) throws java.io.IOException { 
         System.out.println("RequestListenerDemo --onComplete!");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         System.out.println("RequestListenerDemo --requestDestroyed");
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         System.out.println("RequestListenerDemo --attributeRemoved!");
         System.out.println("    attributeRemoved: "+arg0.getName()+" 被移除！");
    }

	/**
     * @see AsyncListener#onError(AsyncEvent)
     */
    public void onError(AsyncEvent arg0) throws java.io.IOException { 
        System.out.println("RequestListenerDemo --onError!");
    }

	/**
     * @see AsyncListener#onStartAsync(AsyncEvent)
     */
    public void onStartAsync(AsyncEvent arg0) throws java.io.IOException { 
       System.out.println("RequestListenerDemo --onStartAsync!");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
        System.out.println("RequestListenerDemo --requestInitialized");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         System.out.println("RequestListenerDemo --attributeAdded");
         System.out.println("    attributeAdded:"+arg0.getName() + "=" +arg0.getValue());
    }

	/**
     * @see AsyncListener#onTimeout(AsyncEvent)
     */
    public void onTimeout(AsyncEvent arg0) throws java.io.IOException { 
    	System.out.println("RequestListenerDemo --onTimeout");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	System.out.println("RequestListenerDemo --attributeReplaced");
    	System.out.println("    attributeReplaced替换之前:" +arg0.getName() + "=" +arg0.getValue());
    	System.out.println("    attributeReplaced替换之后:" +arg0.getName() + "=" +arg0.getServletRequest().getAttribute(arg0.getName()));
    }
	
}
