package com.wwu.SpringLernen;

import org.springframework.context.annotation.*;


public class HelloWorldtest {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void displayMessage(){
		System.out.println(message);
	}
	/*
	@Bean
	public HelloWorld helloWorld2(){
		return new HelloWorld();	
	}
	*/
	

}
