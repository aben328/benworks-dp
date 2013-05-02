package com.jdon.dp.cor.wrong2;


/**
 * 这个办法在增加新的请求request情况下，只是节省了接口的修改量，接口实现ConcreteHandler2还需要修改。而且代码显然不简单美丽。
 * @author jdon
 */
public class ConcreteHandler2 implements HelpHandler, PrintHandler, FormatHandler {
	private HelpHandler helpSuccessor;
	private PrintHandler printSuccessor;
	private FormatHandler formatSuccessor;

	public ConcreteHandler2(HelpHandler helpSuccessor, PrintHandler printSuccessor, FormatHandler formatSuccessor) {
		this.helpSuccessor = helpSuccessor;
		this.printSuccessor = printSuccessor;
		this.formatSuccessor = formatSuccessor;
	}

	public void handleHelp() {
		// .......
	}

	public void handlePrint() {
		this.printSuccessor = printSuccessor;
	}

	public void handleFormat() {
		this.formatSuccessor = formatSuccessor;
	}

}