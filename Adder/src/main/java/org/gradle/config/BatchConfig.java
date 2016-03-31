package org.gradle.config;

import org.gradle.Adder;
import org.gradle.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {
	
	@Bean
	public Adder adder(){
		return new Adder();
	}

	@Bean
	public Waiter waiter(){
		return new Waiter();
	}

	
}
	

