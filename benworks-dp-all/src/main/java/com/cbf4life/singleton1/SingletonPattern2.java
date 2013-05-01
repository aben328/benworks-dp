package com.cbf4life.singleton1;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 通用单例模式
 */
@SuppressWarnings("all")
public class SingletonPattern2 {
	private static final SingletonPattern2 singletonPattern = new SingletonPattern2();

	// 限制住不能直接产生一个实例
	private SingletonPattern2() {
	}

	public synchronized static SingletonPattern2 getInstance() {
		return singletonPattern;
	}

}
