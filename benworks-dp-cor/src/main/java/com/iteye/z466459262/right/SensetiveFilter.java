package com.iteye.z466459262.right;

public class SensetiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		// process sensetive word
		msg = msg.replace("敏感", "**");

		return msg;
	}

}
