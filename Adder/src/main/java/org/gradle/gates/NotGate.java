package org.gradle.gates;


import org.springframework.stereotype.Component;

@Component
public class NotGate implements Gate{
	public boolean evaluate(boolean a, boolean b) {
		boolean c=(a==true&&b==false)? false:true;
		return c;
	}
}
