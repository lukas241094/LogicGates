package org.gradle.gates;

import org.springframework.stereotype.Component;

@Component
public interface Gate {

	boolean evaluate(boolean a, boolean b);
	
	
}
