package org.gradle.gates;

import org.springframework.stereotype.Component;

@Component
public class NandGate implements Gate{
	public boolean evaluate(boolean a, boolean b) {
		boolean c=(a==true&&b==true)? false:true;
		return c;
	}

}
