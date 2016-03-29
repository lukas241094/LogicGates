package com.wwu.SpringLernen;

import org.springframework.context.annotation.*;


@Configuration
public class HelloWorldConfig {
	
	@Bean
	public HelloWorldtest helloWorld(){
		return new HelloWorldtest();
	}
	@Bean
	public HelloWorldtest helloWorld2(){
		return new HelloWorldtest();
	}
	
}
