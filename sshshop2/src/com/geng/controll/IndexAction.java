package com.geng.controll;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 首页访问的Action
 */
public class IndexAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {

		return "index";
	}

}
