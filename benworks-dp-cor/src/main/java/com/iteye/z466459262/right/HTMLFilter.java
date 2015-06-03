/**
 * 
 */
package com.iteye.z466459262.right;


/**
 * @author Ben
 */
public class HTMLFilter implements Filter {

	/* 这是一个接口的实现，也就是一个被解耦的外部功能
	 * 
	 * @see com.iteye.z466459262.Filter#doFilter(java.lang.String) */
	@Override
	public String doFilter(String msg) {
		// 处理html tag
		msg = msg.replace("<", "[").replace(">", "]");

		return msg;
	}

}
