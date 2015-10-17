package com.javapatterns.simplefactory;

public class BadFruitException extends Exception {
	private static final long serialVersionUID = 2730143619135182807L;

	public BadFruitException(String msg) {
		super(msg);
	}
}
