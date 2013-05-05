package com.cbf4life.abstractfactory;


/**
 * 看到没，这就是引入 enum 的好处，createHuman(HumanEnum humanEnum)这个方法定义了输入参数必须 是 HumanEnum 类型，然后直接使用
 * humanEnum.getValue()方法就能获得具体传递进来的值，这个不多说了， 大家自己看程序领会，没多大难度，这个抽象类的目的就是减少下边实现类的代码量，
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 编写一个抽象类，根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {

	/* 给定一个性别人类，创建一个人类出来 专业术语是产生产品等级 */
	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		// 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
		if (!humanEnum.getValue().equals("")) {
			try {
				// 直接产生一个实例
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (Exception e) {
				// 因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
				e.printStackTrace();
			}
		}
		return human;
	}

}
