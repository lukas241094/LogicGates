package org.gradle.gates;

import org.gradle.Interface.Gate;
import org.springframework.stereotype.Component;


@Component("OrGate")
public class OrGate implements Gate{
    	public boolean evaluate(boolean a, boolean b) {
		boolean c=(a==true||b==true)? true:false;
		return c;
	}
}
