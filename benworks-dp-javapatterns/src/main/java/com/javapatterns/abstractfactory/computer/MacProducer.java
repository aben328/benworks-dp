package com.javapatterns.abstractfactory.computer;

public class MacProducer implements ComputerProducer {
	public Cpu createCpu() {
		return new MacCpu();
	}

	public Ram createRam() {
		return new MacRam();
	}

	/**
	 * @link dependency
	 * @label Creates
	 */
	/* # MacRam lnkMacRam; */

	/**
	 * @link dependency
	 * @label Creates
	 */
	/* # MacCpu lnkMacCpu; */
}
