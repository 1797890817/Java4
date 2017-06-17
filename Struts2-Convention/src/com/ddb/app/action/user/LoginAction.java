package com.ddb.app.action.user;

import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath("/content/")	//注意这一行若不加，系统会提示找不到结果配置，dudongbin
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 封装请求参数的username和password成员变量
	private String username;
	private String password;

	// 省略所有的setter和getter方法

	// username的setter和getter方法
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	// password的setter和getter方法
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	// 处理用户请求的execute方法
	public String execute() throws Exception {
		if (getUsername().equals("admin") && getPassword().equals("admin")) {
			ActionContext.getContext().getSession().put("user", getUsername());
			return SUCCESS;
		}
		return ERROR;
	}
}