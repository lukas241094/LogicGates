package org.gradle.Interface;

import org.springframework.stereotype.Component;

@Component
public interface Gate {

	boolean evaluate(boolean a, boolean b);
	
	
}
