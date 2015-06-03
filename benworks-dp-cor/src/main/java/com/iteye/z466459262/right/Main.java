package com.iteye.z466459262.right;

public class Main {
	public static void main(String[] args) {
		String msg = "adfasdf,操，爱上对方答复 < 敏感 >";

		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain filterChain = new FilterChain();// 插座是个类，所以要new 出来
		filterChain.add(new HTMLFilter()).add(new SensetiveFilter());
//		msg = mp.process(filterChain);
		System.out.println(msg);
	}
}
