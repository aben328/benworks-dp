package com.cbf4life.strategy;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you all. 孙夫人断后，挡住追兵
 */

public class BlockEnemy implements IStrategy {

	/* (non-Javadoc)
	 * 
	 * @see com.cbf4life.strategy.IStrategy#operate() */
	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}

}
