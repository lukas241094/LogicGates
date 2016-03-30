package org.gradle.gates;

import org.springframework.stereotype.Component;


@Component
public class Nor implements Gate {
		public boolean evaluate(boolean a, boolean b) {
			boolean c=(a==false&&b==false)? true:false;
			return c;
		}
}


