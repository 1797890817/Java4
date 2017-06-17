package com.ddb.app.action.book;

import org.apache.struts2.convention.annotation.ResultPath;

import com.ddb.app.service.BookService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
@ResultPath("/content/")
public class GetBooksAction implements Action
{
	// 封装数据的books成员变量
	private String[] books;
	// 省略所有的setter和getter方法

	// books的setter和getter方法
	public void setBooks(String[] books)
	{
		this.books = books;
	}
	public String[] getBooks()
	{
		return this.books;
	}

	// 处理用户请求的execute方法
	public String execute() throws Exception
	{
		String user = (String)ActionContext.getContext()
			.getSession().get("user");
		if (user != null && user.equals("admin"))
		{
			// 创建业务逻辑组件，并调用业务逻辑组件的方法
			BookService bs = new BookService();
			setBooks(bs.getLeeBooks());
			return SUCCESS;
		}
		return LOGIN;
	}
}