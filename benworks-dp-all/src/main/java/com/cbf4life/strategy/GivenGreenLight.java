package com.cbf4life.strategy;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 求吴国太开个绿灯
 */

public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯,放行！");
	}

}
