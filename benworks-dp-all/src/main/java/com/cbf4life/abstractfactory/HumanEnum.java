package com.cbf4life.abstractfactory;

/**
 * Enum 以前我也很少用，最近在一个项目中偶然使用上了，然后才发觉它的好处，Enum 类型作为一个参 数传递到一个方法中时，
 * 在 Junit 进行单元测试的时候，不用判断输入参数是否为空、长度为 0 的边界异
 * 常条件，如果方法传入的参数不是 Enum 类型的话，根本就传递不进来.
 * 
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 世界上有哪些类型的人，列出来 JDK
 *         1.5开始引入enum类型也是目的的，吸引C程序员转过来
 */
public enum HumanEnum {

	// 把世界上所有人类型都定义出来
	YelloMaleHuman("com.cbf4life.abstractfactory.YellowMaleHuman"),

	YelloFemaleHuman("com.cbf4life.abstractfactory.YellowFemaleHuman"),

	WhiteFemaleHuman("com.cbf4life.abstractfactory.WhiteFemaleHuman"),

	WhiteMaleHuman("com.cbf4life.abstractfactory.WhiteMaleHuman"),

	BlackFemaleHuman("com.cbf4life.abstractfactory.BlackFemaleHuman"),

	BlackMaleHuman("com.cbf4life.abstractfactory.BlackMaleHuman");

	private String value = "";

	// 定义构造函数，目的是Data(value)类型的相匹配
	private HumanEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	/* java enum类型尽量简单使用，尽量不要使用多态、继承等方法 毕竟用Class完全可以代替enum */

}
