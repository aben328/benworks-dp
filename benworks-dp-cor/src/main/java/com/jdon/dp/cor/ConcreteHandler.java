package com.jdon.dp.cor;

/**
 * 这个解决方案就是CoR, 在一个链上,都有相应职责的类,因此叫Chain of Responsibility. CoR的优点： 
 * 因为无法预知来自外界（客户端）的请求是属于哪种类型，每个类如果碰到它不能处理的请求只要放弃就可以。
 * 缺点是效率低，因为一个请求的完成可能要遍历到最后才可能完成，当然也可以用树的概念优化。
 * @author jdon
 */
public class ConcreteHandler implements Handler {
	private Handler successor;

	public ConcreteHandler(Handler successor) {
		this.successor = successor;
	}

	public void handleRequest(Request request) {
		if (request instanceof HelpRequest) {
			// 这里是处理Help的具体代码
		} else if (request instanceof PrintRequst) {
			request.execute();
		} else
			// 传递到下一个
			successor.handleRequest(request);
	}
}
