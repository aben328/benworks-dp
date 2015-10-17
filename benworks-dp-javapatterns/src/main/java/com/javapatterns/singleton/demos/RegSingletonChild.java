package com.javapatterns.singleton.demos;

public class RegSingletonChild extends RegSingleton {
	public RegSingletonChild() {
	}

	static public RegSingletonChild getInstance() {
		return (RegSingletonChild) RegSingleton.getInstance("com.javapatterns.singleton.demos.RegSingletonChild");
	}

	public String about() {
		return "Hello, I am RegSingletonChild.";
	}

}
