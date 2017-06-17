package com.ddb.app.action.chain;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("进入第一个Action");
		addActionMessage("第一个Action的提示信息");
		return "second";
	}
}