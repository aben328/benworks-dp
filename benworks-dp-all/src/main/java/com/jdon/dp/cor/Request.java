package com.jdon.dp.cor;

public class Request {
	private String type;

	public Request(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void execute() {
		// request真正具体行为代码
	}

}