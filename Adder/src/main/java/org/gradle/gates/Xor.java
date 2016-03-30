package org.gradle.gates;

import org.springframework.stereotype.Component;

@Component("Xor")
public class Xor implements Gate{
	public boolean evaluate(boolean a, boolean b) {
		boolean c=(a==true^b==true)? true:false;
		return c;
	}
}
