package org.gradle.gates;

import org.springframework.stereotype.Component;


@Component("AndGate")
public class AndGate implements Gate{

	

	public boolean evaluate(boolean a, boolean b) {
		boolean c=(a==true&&b==true)? true:false;
		return c;
	}
}
