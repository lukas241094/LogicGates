package org.gradle.gates;

import org.springframework.stereotype.Component;


@Component
public class Nor implements Gate {
		public boolean evaluate(boolean a, boolean b) {
			return (a||b)? false:true;
		}
}


