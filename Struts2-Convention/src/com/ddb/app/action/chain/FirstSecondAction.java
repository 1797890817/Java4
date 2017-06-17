package com.ddb.app.action.chain;

import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
@ResultPath("/content")
public class FirstSecondAction extends ActionSupport
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 处理用户请求
	public String execute()
	{
		System.out.println("进入第二个Action");
		addActionMessage("第二个Action添加的提示信息");
		return SUCCESS;
	}
}