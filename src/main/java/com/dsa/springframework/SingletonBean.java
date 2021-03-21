package com.dsa.springframework;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Creating singleton bean");
	}

	public String getMyScope() {
		return "I am a singleton";
	}
	
}
