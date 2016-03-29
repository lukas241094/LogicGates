package org.gradle.gates;

public class NAndGate implements Gates {
	
	
	public int evaluate(int a, int b){
		int c=(a==1 && b==1)? 0:1;
		return c;
	}
	

}
