/**
 * 
 */
package com.jdon.dp.cor.wrong1;

import com.jdon.dp.cor.wrong2.Handler;

/**
 * 
 * @author jdon
 */
public class ConcreteHandler implements Handler {
	
	private Handler successor;

	public ConcreteHandler(Handler successor) {
		this.successor = successor;
	}

	public void handleHelp() {
		// 具体处理请求Help的代码
		// ...
	}

	public void handlePrint() {
		// 如果是print 转去处理Print
		successor.handlePrint();
	}

	public void handleFormat() {
		// 如果是Format 转去处理format
		successor.handleFormat();
	}

}
