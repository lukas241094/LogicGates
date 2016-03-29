package org.gradle.gates;

public class NotGate implements Gates{
	public int evaluate(int a, int b){
		int c=(a==1) ? 0:1;
		return c;
	}
	
	

}
