package com.cbf4life.singleton1;

/**
 * 我们来看黄色的那一部分，假如现在有两个线程 A 和线程 B，线程 A 执行到 this.singletonPattern = new SingletonPattern()，正在申请内存分配，可能需要 0.001 微秒，就在这
 * 0.001 微秒之内，线程 B 执 行到 if(this.singletonPattern == null)，你说这个时候这个判断条件是 true 还是 false？是 true，那 然后呢？线程 B
 * 也往下走，于是乎就在内存中就有两个 SingletonPattern 的实例了，看看是不是出问题了？ 如果你这个单例是去拿一个序列号或者创建一个信号资源的时候，会怎么样？业务逻辑混乱！数据一致性
 * 校验失败！最重要的是你从代码上还看不出什么问题，这才是最要命的！
 * @author Ben
 */
@SuppressWarnings("all")
public class SingletonPattern {
	private static SingletonPattern singletonPattern = null;

	// 限制住不能直接产生一个实例
	private SingletonPattern() {

	}

	public SingletonPattern getInstance() {
		if (this.singletonPattern == null) { // 如果还没有实例，则创建一个,这种方式有问题，使用 SingletonPattern2
			this.singletonPattern = new SingletonPattern();
		}
		return this.singletonPattern;
	}

}
