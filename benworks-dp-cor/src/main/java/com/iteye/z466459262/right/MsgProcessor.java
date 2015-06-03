package com.iteye.z466459262.right;

/**
 * @author Ben
 */
public class MsgProcessor {
	private String msg;

	// 定义 插座，插座里面当然是放接口的实现，所以改动的地方只有插座
	Filter[] filters = new Filter[] { new HTMLFilter(), new SensetiveFilter() };

	public String process() {// 这个里面就是如何来用这个插座，你可以顺序的用

		for (Filter f : filters) {
			msg = f.doFilter(msg);
		}
		return msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
