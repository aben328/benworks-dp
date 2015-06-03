package com.iteye.z466459262.wrong;

/**
 * @author Ben
 */
public class Main {
	public static void main(String[] args) {
		String msg = "adfasdf,操，爱上对方答复 < 敏感 >";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		msg = mp.process();
		System.out.println(msg);
	}
}
