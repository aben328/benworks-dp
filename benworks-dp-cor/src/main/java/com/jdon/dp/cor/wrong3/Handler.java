package com.jdon.dp.cor.wrong3;

/**
 * 在Handler接口中只使用一个参数化方法：
 * 这里先假设request是String类型，如果不是怎么办？当然我们可以创建一个专门类Request
 * @author jdon
 */
public interface Handler {
	public void handleRequest(String request);
}
