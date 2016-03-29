package org.gradle.gates;

public class NOrGate implements Gates{
	public int evaluate(int a,int b){
		int c=(a==0 && b==0)? 1:0;
		return c;
	}

}
