package org.gradle.gates;

public class AndGate implements Gates {
	
	
	public int evaluate(int a,int b ){
		int c = (a==1 && b==1) ? 1: 0;
		return c;
	}

}
