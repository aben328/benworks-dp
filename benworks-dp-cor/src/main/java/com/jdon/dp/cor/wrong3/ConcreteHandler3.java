package com.jdon.dp.cor.wrong3;


public class ConcreteHandler3 implements Handler {
	private Handler successor;

	public ConcreteHandler3(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest(String request) {
		if (request.equals("Help")) {
			// 这里是处理Help的具体代码
		} else
			// 传递到下一个
			successor.handleRequest(request);
	}
}
