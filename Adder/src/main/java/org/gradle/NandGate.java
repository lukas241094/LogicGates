package org.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class NandGate implements Gate{

	public int evaluate(int a, int b) {
		int c;
		return c=(a==1&&b==1)? 0:1;
	}

}
