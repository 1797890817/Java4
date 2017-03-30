package com.ddb.javacore.exception;

import org.apache.log4j.Logger;

public class Log4jDemo {
	private Logger logger = Logger.getLogger(this.getClass());

	public void logDemo() {
		logger.debug("这是debug级别的信息...");
		logger.info("这是info级别的信息...");
		logger.warn("这是warn级别的信息...");
		logger.error("这是error级别的信息...");
		logger.fatal("这是fatal级别的信息...");

	}

	public static void main(String[] args) {
		Log4jDemo log4jDemo = new Log4jDemo();
		log4jDemo.logDemo();

	}

}
