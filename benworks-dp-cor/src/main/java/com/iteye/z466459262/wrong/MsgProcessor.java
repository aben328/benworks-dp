package com.iteye.z466459262.wrong;

/**
 * process里面的流程因需求的不同而不同，所以最好能想要的时候就插上，不想要的时候就拔去,基于这种需求，接口是最好的方式
 * @author Ben
 */
public class MsgProcessor {
	private String msg;

	/**
	 * 问题：这里的过滤规则会老是被动态的指定
	 * @return
	 */
	public String process() {
		// 处理html tag
		msg = msg.replace("<", "[").replace(">", "]");

		// process sensetive word
		msg = msg.replace("敏感", "**");

		return msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
