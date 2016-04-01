package org.gradle;

import org.springframework.stereotype.Component;

@Component
public class Store {
	
	Boolean[] input;
	Boolean[] output;
	
	public Boolean[] getInput() {
		return input;
	}
	public void setInput(Boolean[] input) {
		this.input = input;
	}
	public Boolean[] getOutput() {
		return output;
	}
	public void setOutput(Boolean[] output) {
		this.output = output;
	}
	

}
