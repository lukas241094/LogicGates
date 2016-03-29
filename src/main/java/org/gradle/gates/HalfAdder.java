package org.gradle.gates;
import javax.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;




@ Service
public class HalfAdder {
	//Variables of the HalfAdder
	public int a;
	public int b;
	
	// HalfAdder Constructor
	// für groovy test
	HalfAdder(int a, int b){
		this.a=a;
		this.b=b;
	}
	HalfAdder(){	
	}
	
	ApplicationContext halfAdder =
			new AnnotationConfigApplicationContext(MasterConfig.class);
	
	//Requirements for the use of Springbeans
	AndGate andGate = halfAdder.getBean(AndGate.class);
	XOrGate xOrGate = halfAdder.getBean(XOrGate.class);
	
    //Saving result of the HalfAdder
	
	public int [] evaluateHalfAdder(){
	int c = andGate.evaluate(a, b);
	int d = xOrGate.evaluate(a, b);
	int [] halfAdderArray = {c,d};
	return halfAdderArray;
	}

}
