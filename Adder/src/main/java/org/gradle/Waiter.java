package org.gradle;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Waiter {
	
	@Value("${org.gradle.a}")
	boolean a;
	@Resource
	Adder adder;
	
	@Autowired
	public void waiter() throws InterruptedException{
		
        boolean ex = (a)?true:false;
    	while(ex){
    		Optional peter=Optional.ofNullable(null);
    		if (!peter.isPresent()){
    			Thread.sleep(1000);
    			System.out.println("Hello");
    			adder.evaluateadder();
    		}
    		else
    			break;   		
    	}
	}
}
