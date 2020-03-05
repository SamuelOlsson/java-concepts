package com.concepts.modifiers;

public class Make {
	
	//Can only be accessed by this class
	private String make;
	public String defaultMake = "We Don't know";
	
	public Make(String make) {
		this.make=make;
	}
	
	public String getMake() {
		return make;
	}
	
}
